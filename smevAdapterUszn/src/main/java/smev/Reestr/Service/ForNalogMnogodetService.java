package smev.Reestr.Service;

import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import smev.ElementServices.NalogMnogodet.Файл;
import smev.Reestr.Dao.ReestrDao;
import smev.Reestr.Entity2.NalogMnogodetEntity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.transform.dom.DOMResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@Log4j2
@Transactional(value = "jdbcRTransactionManager")
public class ForNalogMnogodetService {

    private final static String наимОрг = "ОБЛКОМСОЦЗАЩИТЫ";
    private final static String версФорм = "4.01";
    private final static String типИнф = "СВЕД_МНОГОДЕТ";
    private final static String инн = "3444059322";
    private final static String крр = "344401001";
    private final static String огрн = "1023403456570";
    private final static String кодНО = "3400";
    private final static String кнд = "1114014";

    @Autowired
    private ReestrDao reestrDao;

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }


    public ByteArrayInputStream getFileNalogMnogodetArrayByte() {
        List<NalogMnogodetEntity> nalogMnogodetData = reestrDao.dataForNalog();
        log.info("dgfdgfd");
        File fileXml = null;

        try {
            Файл файл = FillФайл(nalogMnogodetData);
            JAXBContext jaxbContext = JAXBContext.newInstance(Файл.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "windows-1251");
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            jaxbMarshaller.marshal(файл, out);
            return new ByteArrayInputStream(out.toByteArray());
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getFileNalogMnogodetString() {
        List<NalogMnogodetEntity> nalogMnogodetData = reestrDao.dataForNalog();
        log.info("dgfdgfd");
        try {
            Файл файл = FillФайл(nalogMnogodetData);
            Element xmlStringNalogData = getXMLStringNalogData(файл);
            return smev.Marshaller.Marshaller.elementToString(xmlStringNalogData);
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Файл FillФайл(List<NalogMnogodetEntity> nalogMnogodetData) {

        Файл файл = Файл.builder()
                .идФайл(getIdFile())
                .версФорм(версФорм)
                .типИнф(типИнф)
                .колДок(nalogMnogodetData.size())
                .свОргРег(Файл.СвОргРег.builder()
                        .наимОрг(наимОрг)
                        .иннюл(инн)
                        .кпп(крр)
                        .огрн(огрн)
                        .build())
                .но(Файл.НО.builder()
                        .кодНО(кодНО)
                        .build())
                .документ(createListDoc(nalogMnogodetData))
                .build();
        файл.setИдФайл("11111111111111");


        return файл;
    }

    private List<Файл.Документ> createListDoc(List<NalogMnogodetEntity> nalogMnogodetData) {

        List<NalogMnogodetEntity> listDistinctIdDoc = nalogMnogodetData.stream()
                .filter(distinctByKey(p -> p.getIdDoc()))
                .collect(Collectors.toList());

        log.info(listDistinctIdDoc.size());

        return null;
    }

    private String getIdFile() {
        return "VO_SVMNDET" + "_0000_" + инн + крр + "_" + LocalDate.now().getYear() + LocalDate.now().getMonth() + LocalDate.now().getDayOfMonth() + "_" + UUID.randomUUID().toString();
    }

    @NotNull
    private Element getXMLStringNalogData(Файл файл) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Файл.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
        jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "windows-1251");
        DOMResult domResult = new DOMResult();
        jaxbMarshaller.marshal(файл, domResult);
        return ((Document) domResult.getNode()).getDocumentElement();
    }

}

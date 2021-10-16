package smev.utils;

import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Chronology;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.ISOChronology;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.anatol.sjema.xml.DomException;
import smev.ElementServices.Other.Status;
import smev.Marshaller.Marshaller;
import smev.Reestr.Dto.SubjectDataDTO;
import smev.Wrapper.ObjectMessage;
import smev.exceptions.RsServiceException;

import javax.swing.text.MaskFormatter;
import javax.xml.bind.JAXB;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Log4j2
public class util {

    public static boolean isUUID(String s) {
        return s.matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    }

    public static String getName(String namespace) {
        String name = namespace;
        int pos = name.lastIndexOf("://");
        if (pos != -1) {
            name = name.substring(pos + 3);
        }
        int lastSlash = name.lastIndexOf("/");
        if (lastSlash != -1) {
            name = name.substring(0, lastSlash);
        }
        return name;
    }


    public static String getStringNotSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    public static String getStringOnlyNumber(String str) {
        return str.replaceAll("\\D+", "");
    }

    public static String getStringOnlyNumberAndRussian(String str) {
        return str.replaceAll("[^\\dа-яёА-ЯЁ ]", "");
    }

    private static String inline(String xml) {
        /* 195 */
        return xml.replaceAll(">(\\s*)<", "><");
        /*     */
    }

    public static String statusToContent(Status status) throws IOException {
        /*  35 */
        if (status == null) {
            /*  36 */
            return null;
            /*     */
        }
        /*  38 */
        try (Writer writer = new StringWriter()) {
            /*  39 */
            JAXB.marshal(status, writer);
            /*  40 */
            return inline(writer.toString());
            /*     */
        }
        /*     */
    }

    private static String getXsltTemplatePath() {
        return "xsltTemplates\\";
    }


    @Nullable
    public static String getPathXsltForm(String xsltForm) {
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        Resource[] theResources = new Resource[0];
        String path = null;
        try {
            theResources = patternResolver.getResources("classpath:" + getXsltTemplatePath() + xsltForm);
            path = theResources[0].getURI().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }


    public static LocalDate toLocalDate(Date date) {
        return date != null ? Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate() : null;

    }

    public static LocalDate toLocalDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return dateString != "" ? LocalDate.parse(dateString, formatter) : null;
    }

    public static java.time.LocalDateTime DatetoLocalDateTime(Date date) {
        return date == null ? null : Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public static XMLGregorianCalendar StringToXmlGregorianCalendar(String dateString) throws ParseException, DatatypeConfigurationException {
//        Date date = DateUtils.parseDate(dateString,
//                new String[] { "yyyy-MM-dd", "yyyy-MM-dd" });

        //String format = "yyyy-MM-dd";
//        GregorianCalendar cal = new GregorianCalendar();
//        cal.setTime(date);
//        XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
//        calendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
//        return calendar;
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(date));
    }

    public static LocalDateTime localFrom(Calendar calendar) {
        return new LocalDateTime(calendar.getTime().getTime(), (Chronology) ISOChronology.getInstance());
    }

    public static LocalDateTime localFrom(XMLGregorianCalendar eol) {
        if (eol == null)
            return null;
        GregorianCalendar calendar = eol.toGregorianCalendar();
        return localFrom(calendar);
    }

    public static final XMLGregorianCalendar getDate(Date d) {
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(d));
        } catch (DatatypeConfigurationException e) {
            return null;
        }
    }


    public static LocalDate toLocalDate(Timestamp timestamp) {
        return timestamp == null ? null : java.time.LocalDateTime.ofInstant(timestamp.toInstant(), ZoneId.systemDefault()).toLocalDate();
    }

    public static Element toElement(String value) {
        if (value == null) {
            return null;
        }
        try {
            Document document = toDocument(value.getBytes(StandardCharsets.UTF_8));
            return document.getDocumentElement();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;


    }

    public static Document toDocument(byte[] xml) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        documentBuilderFactory.setValidating(false);
        documentBuilderFactory.setIgnoringComments(true);
        documentBuilderFactory.setExpandEntityReferences(true);
        documentBuilderFactory.setXIncludeAware(true);
        documentBuilderFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        try (InputStream inputStream = new ByteArrayInputStream(xml)) {
            return documentBuilder.parse(inputStream);
        }
    }
//    public static String getNamespace(XMessageContainerDto message) throws DomException {
//        if (message == null || message.getMessageContent() == null || message.getMessageContent().getContent() == null) {
//            return null;
//        }
//        Document xmlData = DomUtil.getDocument(message.getMessageContent().getContent());
//        return xmlData.getDocumentElement().getNamespaceURI();
//    }


    public static ObjectMessage getObjectMessageFromString(String content) {
        Element item = getElementMessagePrimaryContent(content, "MessagePrimaryContent");
        ObjectMessage ob = new ObjectMessage();
        if (item == null) {
            ob.setData(null);
        } else
            ob.setData(Marshaller.unmarshal(item));
        return ob;
    }

    // @NotNull
    public static Element getElementMessagePrimaryContent(String content, String localName) {
        Element element = null;
        element = toElement(content);
        NodeList messagePrimaryContent = element.getElementsByTagNameNS("*", localName);
//        NodeList messagePrimaryContent = element.getElementsByTagName(localName);
//        Document document = util.toDocument(content.getBytes(StandardCharsets.UTF_8));
        if (messagePrimaryContent.getLength() > 0) {
            return (Element) messagePrimaryContent.item(0).getFirstChild();
        }
        return null;
    }

    public static String getInnerHTML(Node node) {
        StringWriter sw = new StringWriter();
        Result result = new StreamResult(sw);
        try {
            TransformerFactory factory = new net.sf.saxon.TransformerFactoryImpl();
            Transformer proc = factory.newTransformer();
            proc.setOutputProperty(OutputKeys.METHOD, "html");

            for (int i = 0; i < node.getChildNodes().getLength(); i++) {
                proc.transform(new DOMSource(node.getChildNodes().item(i)), result);
            }
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return sw.toString();
    }

    public static Element getElementMessagePrimaryContent(Element any, String localName) {
        NodeList messagePrimaryContent = any.getElementsByTagNameNS("*", localName);
        //Document document = util.toDocument(content.getBytes(StandardCharsets.UTF_8));
        if (messagePrimaryContent.getLength() > 0) {
            return (Element) messagePrimaryContent.item(0).getFirstChild();
        }
        return null;
    }

    public static String UUIDtoString(UUID uuid) {
        return uuid == null ? null : uuid.toString();
    }

    public static UUID StringToUUID(String idStr) {
        return idStr == null ? null : UUID.fromString(idStr);
    }

    public static String getNamespace(String content) throws DomException {
        // ((RequestMessageType) message).getRequestContent().
        if ((content) == null) {
            return null;
        }
        Document xmlData = getDocument(content);
        return xmlData.getDocumentElement().getNamespaceURI();


    }

    public static Document getDocument(String xml) throws DomException {
        return getDocument(xml.getBytes(StandardCharsets.UTF_8));
    }

    public static Document getDocument(byte[] xml) throws DomException {
        /*  76 */
        try (InputStream inputStream = new ByteArrayInputStream(xml)) {
            /*  77 */
            return getDocument(inputStream);
            /*  78 */
        } catch (IOException ex) {
            /*  79 */
            throw new DomException(ex);
            /*     */
        }
        /*     */
    }

    public static Document getDocument(InputStream in) throws DomException {
        /*     */
        try {
            /*  58 */
            return getBuilder().parse(in);
            /*  59 */
        } catch (SAXException ex) {
            /*  60 */
            throw new DomException(ex);
            /*  61 */
        } catch (IOException ex) {
            /*  62 */
            throw new DomException(ex);
            /*     */
        }
        /*     */
    }

    private static DocumentBuilder getBuilder() throws DomException {
        /*     */
        try {
            /*  38 */
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            /*  39 */
            documentBuilderFactory.setNamespaceAware(true);
            /*  40 */
            documentBuilderFactory.setValidating(false);
            /*  41 */
            return documentBuilderFactory.newDocumentBuilder();
            /*  42 */
        } catch (ParserConfigurationException ex) {
            /*  43 */
            throw new DomException(ex);
            /*     */
        }
        /*     */
    }

    public static byte[] toByteArray(Element element) {
        Transformer transformer = null;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            Source source = new DOMSource(element);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            StreamResult result = new StreamResult(bos);
            transformer.transform(source, result);
            return bos.toByteArray();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String prepareFilename(String filename) throws UnsupportedEncodingException {
        return URLEncoder.encode(filename, "UTF-8")
                .replaceAll("\\+", " ")
                .replaceAll("%20", " ")
                .replaceAll("%21", "!")

                .replaceAll("%23", "#")

                .replaceAll("%26", "&")
                .replaceAll("%27", "'")
                .replaceAll("%28", "(")
                .replaceAll("%29", ")")

                .replaceAll("%2B", "+")
                .replaceAll("%2C", ",")

                .replaceAll("%3B", ";")

                .replaceAll("%3D", "=")


                .replaceAll("%40", "@")
                .replaceAll("%5B", "[")
                .replaceAll("%5D", "]")
                .replaceAll("%5E", "^")
                .replaceAll("%60", "`")
                .replaceAll("%7B", "{")

                .replaceAll("%7D", "}")
                .replaceAll("%25", "%");
    }


    public static String getSnilsFormatting1(String snils) {
        try {
            MaskFormatter maskFormatterSnils = new MaskFormatter("###-###-### ##");
            maskFormatterSnils.setValueContainsLiteralCharacters(false);
            return maskFormatterSnils.valueToString(snils);
        } catch (ParseException e) {
            log.error("Ошибка форматирования маски {}", snils);
            log.error(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String getSnilsFormatting2(String snils) {
        try {
            MaskFormatter maskFormatterSnils = new MaskFormatter("### ### ### ##");
            maskFormatterSnils.setValueContainsLiteralCharacters(false);
            return maskFormatterSnils.valueToString(snils);
        } catch (ParseException e) {
            log.error("Ошибка форматирования маски {}", snils);
            log.error(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

}

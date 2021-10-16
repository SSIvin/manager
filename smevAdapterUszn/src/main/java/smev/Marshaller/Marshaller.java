package smev.Marshaller;


import lombok.extern.log4j.Log4j2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import smev.Wrapper.ObjectMessage;
import smev.exceptions.UtilsException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

/**
 * The type Marshaller.
 */
@Log4j2
public class Marshaller {

    private static final String removeNsString = "<?xml version=\"1.0\" encoding=\"utf-8\"?><xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"><xsl:output method=\"xml\" indent=\"yes\" /><xsl:template match=\"*\"><xsl:element name=\"{local-name(.)}\"><xsl:apply-templates select=\"@* | node()\" /></xsl:element></xsl:template><xsl:template match=\"@*\"><xsl:attribute name=\"{local-name(.)}\"><xsl:value-of select=\".\" /></xsl:attribute></xsl:template></xsl:stylesheet>";
    /**
     * The constant SERVER_API_PACKAGE.
     */
    public static final String SERVER_API_PACKAGE = "smev.ElementServices.Other" +
            ":smev.ElementServices.Snils" +
            ":smev.ElementServices.Kmsz" +
            ":smev.ElementServices.Dohflna" +
            ":smev.ElementServices.FamilyChildSub" +
            ":smev.ElementServices.FnsNdipsr" +
            ":smev.ElementServices.Inn" +
            ":smev.ElementServices.Report" +
            ":smev.ElementServices.Zags" +
            ":smev.ElementServices.ZagsBrakRastor" +
            ":smev.ElementServices.ZagsBrakZak" +
            ":smev.ElementServices.ZagsDeath" +
            ":smev.ElementServices.ZagsParent" +
            ":smev.ElementServices.ZagsRename" +
            ":smev.ElementServices.ZagsRojd" +
            ":smev.ElementServices.Egisso" +
            ":smev.ElementServices.Egisso.Death" +
            ":smev.ElementServices.Egisso.Registers" +
            ":smev.ElementServices.Egisso.ElementsKmsz" +
            ":smev.ElementServices.infoEgissoBySnils" +
            ":smev.ElementServices.Fri" +
            ":smev.ElementServices.NalogMnogodet" +
            ":smev.ElementServices.Gibdd" +
            ":smev.ElementServices.Mvd" +
            ":smev.ElementServices.GisJKH" +
            ":smev.ElementServices.Szn" +
            ":smev.ElementServices.Rosreestr" +
            ":smev.ElementServices.fault";
    //    public static final String SERVER_API_PACKAGE = "ru.uszn.smev.ElementServices.Dohflna.DOHFLNARequest";
    private static ThreadLocal<JAXBContext> jaxbContext = new ThreadLocal<>();

    private static void init() {
        if (jaxbContext.get() == null) {
            try {
                jaxbContext.set(JAXBContext.newInstance(SERVER_API_PACKAGE));
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Marshal Object to element.
     */
    public static Element marshal(ObjectMessage obj) throws UtilsException {

        if (jaxbContext.get() == null) { //bad design
            init();
        }
        DOMResult domResult = new DOMResult();

        try {
            javax.xml.bind.Marshaller marshaller = jaxbContext.get().createMarshaller();
//            Marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, true);
            marshaller.marshal(obj, domResult);
        } catch (JAXBException e) {
            throw new UtilsException(e.getMessage(), e);
        }

//        Element documentElement = ((Document) domResult.getNode()).getDocumentElement();
//        for (int j = 0; j < documentElement.getAttributes().getLength(); j++) {
//            if (documentElement.getAttributes().item(0).getNodeName().startsWith("xmlns:")) {
//                //documentElement.removeAttribute(documentElement.getAttributes().item(0).getNodeName());
//                //j = 0;
//               }
//        }
        return ((Document) domResult.getNode()).getDocumentElement();
    }

    public static Element marshal(Object obj) throws UtilsException {

        if (jaxbContext.get() == null) { //bad design
            init();
        }
        DOMResult domResult = new DOMResult();

        try {
            javax.xml.bind.Marshaller marshaller = jaxbContext.get().createMarshaller();
//            Marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, true);
            marshaller.marshal(obj, domResult);
        } catch (JAXBException e) {
            throw new UtilsException(e.getMessage(), e);
        }

//        Element documentElement = ((Document) domResult.getNode()).getDocumentElement();
//        for (int j = 0; j < documentElement.getAttributes().getLength(); j++) {
//            if (documentElement.getAttributes().item(0).getNodeName().startsWith("xmlns:")) {
//                //documentElement.removeAttribute(documentElement.getAttributes().item(0).getNodeName());
//                //j = 0;
//               }
//        }
        return ((Document) domResult.getNode()).getDocumentElement();
    }

    /**
     * Marshal Object to File.
     */
    public static void marshal(Object obj, File file) throws UtilsException {

        if (jaxbContext.get() == null) { //bad design
            init();
        }
        try {
            javax.xml.bind.Marshaller marshaller = jaxbContext.get().createMarshaller();
            marshaller.marshal(obj, file);
        } catch (JAXBException e) {
            throw new UtilsException(e.getMessage(), e);
        }
    }

    public static void marshal(Object obj, OutputStream outputStream) throws UtilsException {

        if (jaxbContext.get() == null) { //bad design
            init();
        }
        try {
            javax.xml.bind.Marshaller marshaller = jaxbContext.get().createMarshaller();
            marshaller.marshal(obj, outputStream);
        } catch (JAXBException e) {
            throw new UtilsException(e.getMessage(), e);
        }
    }

    public static InputSource removeNS(String content) {
        StringWriter writer;
        TransformerFactory factory = TransformerFactory.newInstance();
        /*через файл*/
        //Source xslt = new StreamSource(new File("removeNs.xslt"));
        /*через строку*/
        Source xslt = new StreamSource(new StringReader(removeNsString));
        Transformer transformer = null;
        try {
            transformer = factory.newTransformer(xslt);
            Source text = new StreamSource(new StringReader(content));
            writer = new StringWriter();
            transformer.transform(text, new StreamResult(writer));
            return new InputSource(new StringReader(writer.toString()));
        } catch (TransformerException e) {
            log.error("Ошибка удаления nameSpaces в xml", e);
            e.printStackTrace();
        }
        return null;
    }

    public static String removeNStoString(String content) {
        if (content != null & content != "") {
            StringWriter writer;
            TransformerFactory factory = TransformerFactory.newInstance();
            //Source xslt = new StreamSource(new File("removeNs.xslt"));
            Source xslt = new StreamSource(new StringReader(removeNsString));
            Transformer transformer = null;
            try {
                transformer = factory.newTransformer(xslt);
                Source text = new StreamSource(new StringReader(content));
                writer = new StringWriter();
                transformer.transform(text, new StreamResult(writer));
                return writer.toString();
            } catch (TransformerException e) {
                log.error("Ошибка удаления nameSpaces в xml", e);
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }

    /**
     * Unmarshal String.
     */
    public static Object unmarshal(String content) throws UtilsException {
        if (content == null || content.equals("")) {
            throw new UtilsException("Отсутствуют данные для преобразования");
        }
        if (jaxbContext.get() == null) {
            init();
        }
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new InputSource(new StringReader(content)));
            return jaxbContext.get().createUnmarshaller().unmarshal(doc.getDocumentElement());
        } catch (JAXBException e) {
            throw new UtilsException(e.getMessage(), e);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Element convertStringToElement(String content) throws UtilsException {
        if (content == null || content.equals("")) {
            throw new UtilsException("Отсутствуют данные для преобразования");
        }
        if (jaxbContext.get() == null) {
            init();
        }
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new InputSource(new StringReader(content)));
            return doc.getDocumentElement();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Unmarshal object.
     */
    public static Object unmarshal(Element element) throws UtilsException {
        if (jaxbContext.get() == null) {
            init();
        }
        try {
            return element == null ? null : jaxbContext.get().createUnmarshaller().unmarshal(element);
        } catch (JAXBException e) {
            throw new UtilsException(e.getMessage(), e);
        }
    }




    public static Object unmarshal(InputSource inputSource) throws UtilsException {
        if (jaxbContext.get() == null) {
            init();
        }
        try {
            SAXSource source = new SAXSource(inputSource);
            return jaxbContext.get().createUnmarshaller().unmarshal(source);
        } catch (JAXBException e) {
            throw new UtilsException(e.getMessage(), e);
        }
    }

    /**
     * Convert element to string string.
     *
     * @param rs the rs
     * @return the string
     * @throws TransformerException the transformer exception
     */
    public static String convertElementToString(Object rs) {
        TransformerFactory transFactory = TransformerFactory.newInstance();
        StringWriter buffer = new StringWriter();
        try {
            Transformer transformer = transFactory.newTransformer();
            transformer.setOutputProperty("omit-xml-declaration", "yes");
//            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "true");
            //transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "true");
            transformer.transform(new DOMSource(Marshaller.marshal(rs)),
                    new StreamResult(buffer));
        } catch (TransformerException ex) {
            log.error("", ex);
        }
        return buffer.toString();
    }

//    protected static String objToString(Object obj) throws TransformerException {
//        TransformerFactory transFactory = TransformerFactory.newInstance();
//        Transformer transformer = transFactory.newTransformer();
//        StringWriter buffer = new StringWriter();
//        transformer.transform(new DOMSource(Marshaller.marshal(obj)),
//                new StreamResult(buffer));
//        return buffer.toString();
//    }

    /**
     * Парсит XML файл и возвращает корневой элемент
     *
     * @param file файл с xml документом
     * @return корневой элемент документа
     * @throws IOException                  в случае ошибки чтения входного файла
     * @throws ParserConfigurationException в случае ошибки создания xml парсера
     * @throws SAXException                 в случае невалидного xml кода
     */
    protected static Element fileToElement(File file) throws IOException, ParserConfigurationException, SAXException {
        if (file == null) {
            return null;
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            documentBuilderFactory.setCoalescing(true);
            documentBuilderFactory.setIgnoringElementContentWhitespace(true);
            return documentBuilderFactory.newDocumentBuilder().parse(inputStream).getDocumentElement();
        }
    }

    /**
     * Преобразует указанный текст в xml файл и возвращает корневой элемент полученного документа
     *
     * @param xml текст xml файла
     * @return корневой элемент документа
     */
    private static Element stringToElement(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xml)));
            return document.getDocumentElement();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Cannot transform specified string to xml document", ex);
        }
    }


    /**
     * Преобразует указанный xml элемент в строку
     *
     * @param element элемент для преобразования
     * @return строковое представление указанного элемента
     */
    public static String elementToString(Element element) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            DOMSource source = new DOMSource(element);
            transformer.transform(source, result);
            return writer.toString();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot transform xml element to string", ex);
        }
    }
}

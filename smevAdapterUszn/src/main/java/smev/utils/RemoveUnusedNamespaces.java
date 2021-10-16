package smev.utils;



import lombok.extern.log4j.Log4j2;
import org.w3c.dom.*;

import java.util.HashSet;
import java.util.Set;


/**
 * удаление не используемых namespaces в Element
 *

 */
@Log4j2
public class RemoveUnusedNamespaces {


    private static final String XML_NAMESPACE_SCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";

    private static final String XML_NAMESPACE_NAMESPACE = "http://www.w3.org/2000/xmlns/";

    private interface ElementVisitor {

        void visit(Element element);

    }

    public void process(Document document) {
        final Set<String> namespaces = new HashSet<String>();

        Element element = document.getDocumentElement();
        traverse(element, new ElementVisitor() {

            public void visit(Element element) {
                String namespace = element.getNamespaceURI();
                if (namespace == null)
                    namespace = "";
                namespaces.add(namespace);
                NamedNodeMap attributes = element.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Node node = attributes.item(i);
                    if (XML_NAMESPACE_NAMESPACE.equals(node.getNamespaceURI()))
                        continue;
                    String prefix;
                    if (XML_NAMESPACE_SCHEMA_INSTANCE.equals(node.getNamespaceURI())) {
                        if ("type".equals(node.getLocalName())) {
                            String value = node.getNodeValue();
                            if (value.contains(":"))
                                prefix = value.substring(0, value.indexOf(":"));
                            else
                                prefix = null;
                        } else {
                            continue;
                        }
                    } else {
                        prefix = node.getPrefix();
                    }
                    namespace = element.lookupNamespaceURI(prefix);
                    if (namespace == null)
                        namespace = "";
                    namespaces.add(namespace);
                }
            }

        });
        traverse(element, new ElementVisitor() {

            public void visit(Element element) {
                Set<String> removeLocalNames = new HashSet<String>();
                NamedNodeMap attributes = element.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Node node = attributes.item(i);
                    if (!XML_NAMESPACE_NAMESPACE.equals(node.getNamespaceURI()))
                        continue;
                    if (namespaces.contains(node.getNodeValue()))
                        continue;
                    removeLocalNames.add(node.getLocalName());
                }
                for (String localName : removeLocalNames)
                    //element.removeAttributeNS(XML_NAMESPACE_NAMESPACE, localName);
                    element.removeAttribute("xmlns:" + localName);
            }

        });
    }

    public void process(Element element) {
        final Set<String> namespaces = new HashSet<String>();

        traverse(element, new ElementVisitor() {

            public void visit(Element element) {
                String namespace = element.getNamespaceURI();
                if (namespace == null)
                    namespace = "";
                namespaces.add(namespace);
                NamedNodeMap attributes = element.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Node node = attributes.item(i);
                    if (XML_NAMESPACE_NAMESPACE.equals(node.getNamespaceURI()))
                        continue;
                    String prefix;
                    if (XML_NAMESPACE_SCHEMA_INSTANCE.equals(node.getNamespaceURI())) {
                        if ("type".equals(node.getLocalName())) {
                            String value = node.getNodeValue();
                            if (value.contains(":"))
                                prefix = value.substring(0, value.indexOf(":"));
                            else
                                prefix = null;
                        } else {
                            continue;
                        }
                    } else {
                        prefix = node.getPrefix();
                    }
                    namespace = element.lookupNamespaceURI(prefix);
                    if (namespace == null)
                        namespace = "";
                    namespaces.add(namespace);
                }
            }

        });
        traverse(element, new ElementVisitor() {

            public void visit(Element element) {
                Set<String> removeLocalNames = new HashSet<String>();
                NamedNodeMap attributes = element.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Node node = attributes.item(i);
                    if (!XML_NAMESPACE_NAMESPACE.equals(node.getNamespaceURI()))
                        continue;
                    if (namespaces.contains(node.getNodeValue()))
                        continue;
                    removeLocalNames.add(node.getLocalName());
                }
                for (String localName : removeLocalNames)
                    //element.removeAttributeNS(XML_NAMESPACE_NAMESPACE, localName);
                    element.removeAttribute("xmlns:" + localName);
            }

        });
    }

    private final void traverse(Element element, ElementVisitor visitor) {
        visitor.visit(element);
        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            if (node.getNodeType() != Node.ELEMENT_NODE)
                continue;
            traverse((Element) node, visitor);
        }
    }

}

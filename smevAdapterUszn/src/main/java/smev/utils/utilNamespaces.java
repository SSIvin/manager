package smev.utils;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class utilNamespaces {

    private static final String XMLNAMESPACE = "xmlns";
    /**
     * Starting from a node, find the namespace declaration for a prefix. for a matching namespace
     * declaration.
     *
     * @param node search up from here to search for namespace definitions
     * @param searchPrefix the prefix we are searching for
     * @return the namespace if found.
     */
    public static String getNamespace(Node node, String searchPrefix) {

        Element el;
        while (!(node instanceof Element)) {
            node = node.getParentNode();
        }
        el = (Element)node;

        NamedNodeMap atts = el.getAttributes();
        for (int i = 0; i < atts.getLength(); i++) {
            Node currentAttribute = atts.item(i);
            String currentLocalName = currentAttribute.getLocalName();
            String currentPrefix = currentAttribute.getPrefix();
            if (searchPrefix.equals(currentLocalName) && XMLNAMESPACE.equals(currentPrefix)) {
                return currentAttribute.getNodeValue();
            } else if (isEmpty(searchPrefix) && XMLNAMESPACE.equals(currentLocalName)
                    && isEmpty(currentPrefix)) {
                return currentAttribute.getNodeValue();
            }
        }

        Node parent = el.getParentNode();
        if (parent instanceof Element) {
            return getNamespace((Element)parent, searchPrefix);
        }

        return null;
    }
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

}

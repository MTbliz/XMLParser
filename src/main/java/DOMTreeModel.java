import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMTreeModel {

    private Document document;

    public DOMTreeModel() {
    }

    public DOMTreeModel(Document document) {
        this.document = document;
    }

    public Object getRoot() {
        return document.getDocumentElement();
    }

    public int getChildCount(Object parent) {
        Node node = (Node) parent;
        NodeList list = node.getChildNodes();
        return list.getLength();
    }

    public Object getChild(Object parent, int index) {
        Node node = (Node) parent;
        NodeList list = node.getChildNodes();
        return list.item(index);
    }

    public int getIndexOfChild(Object parent, Object child) {
        Node node = (Node) parent;
        NodeList list = node.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) {
            if (getChild(node, i) == child) {
                return i;
            }
        }
        return -1;
    }

    public boolean isLeaf(Object node){
        return getChildCount(node) == 0;
    }

    public Document getDocument() {
        return document;
    }
}

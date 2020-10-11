import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXML {

    File file = new File("src/main/resources/CninicalTrialSchema.xml");

    DOMTreeModel domTreeModel = new DOMTreeModel(createDocument(file));

    public ReadXML() throws IOException, SAXException, ParserConfigurationException {
    }

    public Document createDocument(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                .newInstance();
        documentBuilderFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        return document;
    }

    public void readXML() throws ParserConfigurationException, IOException, SAXException {
        Element root = (Element) domTreeModel.getRoot();
        int rootChildCount = domTreeModel.getChildCount(root);
        String ETMFSchemaId = root.getElementsByTagName("id").item(0).getTextContent();
        String ETMFSchemaName = root.getElementsByTagName("name").item(0).getTextContent();
        String ETMFSchemaStudyId = root.getElementsByTagName("studyid").item(0).getTextContent();
        Element nodesElement = (Element) root.getElementsByTagName("nodes").item(0);
        if(!domTreeModel.isLeaf(nodesElement)){
            NodeList nodes = nodesElement.getElementsByTagName("node");
            System.out.println(nodes.getLength());


        }

    }
}

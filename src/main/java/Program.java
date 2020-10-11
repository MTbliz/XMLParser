import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        ReadXML readXML = new ReadXML();
        readXML.readXML();
    }
}

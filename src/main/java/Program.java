
import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException, JAXBException {
        ReadXML readXML = new ReadXML();
        ETMFSchema etmfSchema = readXML.unmarshall();
        System.out.println(etmfSchema.toString());
    }
}

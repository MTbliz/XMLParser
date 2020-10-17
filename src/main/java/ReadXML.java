import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadXML {

    File file = new File("src/main/resources/CninicalTrialSchema.xml");

    public ETMFSchema unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(ETMFSchema.class);
        return (ETMFSchema) context.createUnmarshaller()
                .unmarshal(new FileReader(file));
    }
}

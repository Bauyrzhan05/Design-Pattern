package Template2;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class XMLProcessor extends FileProcessor {
    @Override
    protected void parseFile() {
        System.out.println("Parsing XML document...");
        try {
            DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder()
                    .parse(new ByteArrayInputStream(fileContent.getBytes()));
            System.out.println("XML is well-formed");
        } catch (Exception e) {
            System.out.println("XML parsing error: " + e.getMessage());
        }
    }

    @Override
    protected boolean validateFile() {
        try {
            DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder()
                    .parse(new ByteArrayInputStream(fileContent.getBytes()));
            return true;
        } catch (SAXException | IOException | ParserConfigurationException e) {
            System.out.println("XML validation error: " + e.getMessage());
            return false;
        }
    }

}
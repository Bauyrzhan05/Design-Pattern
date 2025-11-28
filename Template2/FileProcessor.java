package Template2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class FileProcessor {
    protected String fileContent;
    protected String filePath;

    // Template Method
    public final void processFile(String filePath) throws IOException {
        this.filePath = filePath;
        readFile();
        parseFile();
        if (validateFile()) {
            postProcess();
        } else {
            System.out.println("Validation failed for file: " + filePath);
        }
    }

    private void readFile() throws IOException {
        System.out.println("Reading file: " + filePath);
        fileContent = Files.readString(Path.of(filePath));
        System.out.println("File size: " + fileContent.length() + " bytes");
    }

    protected abstract void parseFile();
    protected abstract boolean validateFile();

    protected void postProcess() {
        System.out.println("Processing completed successfully for: " + filePath);
        System.out.println("----------------------------\n");
    }

}

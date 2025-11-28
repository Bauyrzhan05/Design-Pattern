package Template2;

public class PDFProcessor extends FileProcessor {

    @Override
    protected void parseFile() {
        System.out.println("Extracting text from PDF...");
        if (fileContent.startsWith("%PDF-")) {
            System.out.println("Simulated PDF content extraction complete.");
        } else {
            System.out.println("Not a valid PDF file format.");
        }
    }


    @Override
    protected boolean validateFile() {
        System.out.println("Validating PDF structure...");
        // Простая проверка на наличие PDF magic number
        return fileContent.startsWith("%PDF-");
    }
}

package Template2;

public class CSVProcessor extends FileProcessor {
    @Override
    protected void parseFile() {
        System.out.println("Parsing CSV data...");
        String[] lines = fileContent.split("\n");
        System.out.println("Found " + lines.length + " rows");
    }

    @Override
    protected boolean validateFile() {
        System.out.println("Validating CSV format...");
        // Проверяем, что есть хотя бы одна строка и она содержит запятые
        return fileContent.contains(",") && !fileContent.trim().isEmpty();
    }
}
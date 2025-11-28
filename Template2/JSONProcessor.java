package Template2;

public class JSONProcessor extends FileProcessor {

    @Override
    protected void parseFile() {
        System.out.println("Analyze the JSON file...");

        if (fileContent.trim().startsWith("{") && fileContent.trim().endsWith("}")) {
            System.out.println("JSON in the correct format");
        } else {
            System.out.println("JSON is the wrong format");
        }
    }

    @Override
    protected boolean validateFile() {
        System.out.println("Check the JSON file...");

        String content = fileContent.trim();
        boolean isValid = (content.startsWith("{") && content.endsWith("}"))
                || (content.startsWith("[") && content.endsWith("]"));


        if (isValid) {
            System.out.println("JSON file is correct");
        } else {
            System.out.println("JSON is incorrect");
        }

        return isValid;
    }

}
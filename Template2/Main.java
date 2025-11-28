package Template2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== File Processor Menu ===");
            System.out.println("1. Process PDF File");
            System.out.println("2. Process CSV File");
            System.out.println("3. Process JSON File");
            System.out.println("4. Process XML File");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 5) {
                System.out.println("Exiting program...");
                scanner.close();
                return;
            }

            System.out.print("Enter file path: ");
            String filePath = scanner.nextLine();

            try {
                Path path = Paths.get(filePath);
                if (!Files.exists(path)) {
                    System.out.println("File does not exist!");
                    continue;
                }

                FileProcessor processor = null;
                switch (choice) {
                    case 1: processor = new PDFProcessor(); break;
                    case 2: processor = new CSVProcessor(); break;
                    case 3: processor = new JSONProcessor(); break;
                    case 4: processor = new XMLProcessor(); break;
                    default:
                        System.out.println("Invalid choice!");
                        continue;
                }

                System.out.println("\nProcessing file...");
                processor.processFile(filePath);

            } catch (IOException e) {
                System.out.println("Error processing file: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}
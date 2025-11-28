package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory factory = null;

        while (true) {
            System.out.println("Developer factory select:");
            System.out.println("1. Language Factory");
            System.out.println("2. Framework Factory");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                factory = new LanguageFactory();
            } else if (choice == 2) {
                factory = new FrameworkFactory();
            } else {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the option type: ");
            String Type = sc.nextLine();
            Developer develop = factory.createDeveloper(Type);

            if (develop != null) {
                develop.hire();
            } else {
                System.out.println("Invalid Develop type!");
            }
        }
        sc.close();
    }
}

package AdapterAndFacade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentFacade facade = new PaymentFacade();

        while (true) {
            System.out.println("=== Choose a Payment System ===");
            System.out.println("1. Payment via PayPal");
            System.out.println("2. Payment via Halyk");
            System.out.println("3. Payment via Kaspi");
            System.out.println("0. exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("exiting...");
                break;
            }

            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();

            switch (choice) {
                case 1:
                    facade.setPaymentProcessor(new PaymentAdapter());
                    break;
                case 2:
                    facade.setPaymentProcessor(new Halyk());
                    break;
                case 3:
                    facade.setPaymentProcessor(new Kaspi());
                    break;
                default:
                    System.out.println("wrong choose...");
                    continue;
            }

            facade.makePayment(amount);
        }

        scanner.close();
    }
}



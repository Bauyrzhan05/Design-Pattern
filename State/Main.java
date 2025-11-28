package State;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== PHONE MENU ===");
            System.out.println("1. Press Power Button");
            System.out.println("2. Incoming Call");
            System.out.println("3. Answer Call");
            System.out.println("4. Hang Up");
            System.out.println("5. Activate Airplane Mode");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    phone.pressPowerButton();
                    break;
                case 2:
                    phone.incomingCall();
                    break;
                case 3:
                    phone.answerCall();
                    break;
                case 4:
                    phone.hangUp();
                    break;
                case 5:
                    phone.setState(new AirplaneModeState());
                    System.out.println("Airplane Mode activated.");
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}



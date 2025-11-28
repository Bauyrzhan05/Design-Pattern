package Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeRemote remote = new SmartHomeRemote();

        // Create devices
        Computer workComputer = new Computer("Workstation");
        Router homeRouter = new Router("Home");

        Command workComputerOn = new ComputerOnCommand(workComputer);
        Command workComputerOff = new ComputerOffCommand(workComputer);
        Command computerBackup = new ComputerBackupCommand(workComputer);
        Command cancelBackup = new ComputerBackupCancelCommand(workComputer);
        Command computerBrowser = new ComputerBrowserCommand(workComputer);
        Command closeBrowser = new CloseBrowserCommand(workComputer);


        Command homeRouterOn = new RouterOnCommand(homeRouter);
        Command homeRouterOff = new RouterOffCommand(homeRouter);
        Command routerWifi = new RouterWifiCommand(homeRouter);
        Command disableWifi = new NoCommand();

        Command RouterSecurityMode = new RouterSecurityModeCommand(homeRouter);
        Command disableSecurityMode = new NoCommand();


        // Load commands into remote slots
        remote.setCommand(0, workComputerOn, workComputerOff);
        remote.setCommand(1, computerBackup, cancelBackup);
        remote.setCommand(2, computerBrowser, closeBrowser);

        remote.setCommand(3, homeRouterOn, homeRouterOff);
        remote.setCommand(4, routerWifi, disableWifi);
        remote.setCommand(5, RouterSecurityMode, disableSecurityMode);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSmart Home Control System");
            System.out.println(remote);
            System.out.println("1. Turn ON Work Computer");
            System.out.println("2. Turn OFF Work Computer");
            System.out.println("3. Start Computer Backup");
            System.out.println("4. Open Browser");
            System.out.println("5. Turn ON Router");
            System.out.println("6. Turn OFF Router");
            System.out.println("7. Enable WiFi");
            System.out.println("8. enable Security Mode");
            System.out.println("9. Undo last command");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    remote.onButtonWasPushed(0);
                    break;
                case 2:
                    remote.offButtonWasPushed(0);
                    break;
                case 3:
                    remote.onButtonWasPushed(1);
                    break;
                case 4:
                    remote.onButtonWasPushed(2);
                    break;
                case 5:
                    remote.onButtonWasPushed(3);
                    break;
                case 6:
                    remote.offButtonWasPushed(3);
                    break;
                case 7:
                    remote.onButtonWasPushed(4);
                    break;
                case 8:
                    remote.onButtonWasPushed(5);
                    break;
                case 9:
                    remote.undoButtonWasPushed();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }
}

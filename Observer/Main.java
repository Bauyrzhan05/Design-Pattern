package Observer;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter initial quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Stock stock = new Stock(productName, quantity);

        System.out.print("Enter manager name: ");
        StoreManager manager = new StoreManager(sc.nextLine());
        stock.addObserver(manager);

        System.out.print("Enter supplier name: ");
        Supplier supplier = new Supplier(sc.nextLine());
        stock.addObserver(supplier);

        System.out.println("Enter customer name: ");
        Customer customer = new Customer(sc.nextLine());
        stock.addObserver(customer);

        while (true) {
            System.out.println("1 - Update quantity");
            System.out.println("2 - Add observer");
            System.out.println("3 - Remove observer");
            System.out.println("4 - Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter new quantity: ");
                stock.setQuantity(sc.nextInt());
            } else if (choice == 2) {
                System.out.print("Observer type (1-Manager, 2-Supplier, 3-Customer): ");
                int type = sc.nextInt();
                sc.nextLine();

                if (type == 1) {
                    System.out.print("Enter manager name: ");
                    stock.addObserver(new StoreManager(sc.nextLine()));
                } else if (type == 2) {
                    System.out.print("Enter supplier name: ");
                    stock.addObserver(new Supplier(sc.nextLine()));
                } else if (type == 3) {
                    System.out.print("Enter Customer name: ");
                    stock.addObserver(new Customer(sc.nextLine()));
                }
            } else if (choice == 3) {
                System.out.print("Remove (1-Manager, 2-Supplier, 3-Customer): ");
                int type = sc.nextInt();
                sc.nextLine();
                Observer toRemove = null; // at the beginning  it is null

                if (type == 1) {
                    System.out.print("Enter manager name: ");
                    String name = sc.nextLine();
                    for (Observer o : stock.getObservers()) {
                        if (o instanceof StoreManager) {
                            StoreManager sm = (StoreManager) o;
                            if (sm.getName().equals(name))
                                toRemove = sm;
                        }
                    }
                } else if (type == 2) {
                    System.out.print("Enter supplier name: ");
                    String name = sc.nextLine();
                    for (Observer o : stock.getObservers()) {
                        if (o instanceof Supplier) {
                            Supplier s = (Supplier) o;
                            if (s.getCompanyName().equals(name))
                                toRemove = s;
                        }
                    }
                } else if (type == 3){
                    System.out.print("Enter Customer name: ");
                    String name = sc.nextLine();
                    for (Observer o: stock.getObservers()){
                        if (o instanceof Customer){
                            Customer c = (Customer) o;
                            if (c.getCustomerName().equals(name))
                                toRemove = c;
                        }
                    }
                }

                if (toRemove != null) {
                    stock.removeObserver(toRemove);
                }
            } else {
                System.out.println(" Exited...");
                break;
            }
        }
    }
}


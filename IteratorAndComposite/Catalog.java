package IteratorAndComposite;

import java.util.Scanner;

public class Catalog extends Category {
    public Catalog(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Catalog root = new Catalog("Store Catalog");

        Category electronics = new Category("Electronics");
        electronics.add(new Product("Smartphone"));
        electronics.add(new Product("Television"));

        Category laptops = new Category("Laptops");
        laptops.add(new Product("MacBook Pro"));
        laptops.add(new Product("Lenovo ThinkPad"));
        electronics.add(laptops);

        Category groceries = new Category("Food products");
        groceries.add(new Product("milk"));
        groceries.add(new Product("bread"));

        root.add(electronics);
        root.add(groceries);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Show directory structure");
            System.out.println("2. Show all products (iterator)");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    printStructure(root, "");
                    break;
                case "2":
                    root.showAllProducts();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Wrong input.");
            }
        }
    }

    public static void printStructure(CatalogComponent component, String indent) {
        System.out.println(indent + component);
        if (!component.isLeaf()) {
            for (CatalogComponent child : component.getChildren()) {
                printStructure(child, indent + "  ");
            }
        }
    }
}


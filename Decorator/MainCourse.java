package Decorator;

import java.util.Scanner;

public class MainCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a course:");
        System.out.println("1. Python");
        System.out.println("2. Java");
        System.out.print(">");
        int choice = sc.nextInt();

        Course course = null;
        if (choice == 1) {
            course = new PythonCourse();
        } else if (choice == 2) {
            course = new JavaCourse();
        } else {
            System.out.println("wrong choose!");
            return;
        }
        int s = 0;
        int s1 = 0;
        int s2 = 0;
        int end = 0;

        while (true) {
            if  ( end==3) {
                break;
            }
            System.out.println("Select additional features (or click 0): ");
            System.out.println("1. Certificate: +30 000tg");
            System.out.println("2. Extra materials: +50 000tg ");
            System.out.println("3. Individual lesson: +80 000tg ");
            System.out.println("cost: "+course.cost()+ " tg");
            System.out.print(">");
            int decoratorChoice = sc.nextInt();

            if (decoratorChoice == 0 ) {
                break;
            } else if (decoratorChoice == 1 && s == 0) {
                course = new Certificate(course);
                s = 1;
                end += 1;
            } else if (decoratorChoice == 1 && s == 1) {
                System.out.println("this Certificate already have choose other!");
            }else if (decoratorChoice == 2 && s1 == 0) {
                course = new ExtraMaterials(course);
                s1 = 2;
                end += 1;
            } else if (decoratorChoice == 2 && s1 == 2) {
                System.out.println("this ExtraMaterials already have choose other!");
            }else if (decoratorChoice == 3 && s2 == 0) {
                course = new Individual(course);
                s2 = 3;
                end += 1;
            }else if (decoratorChoice == 3 && s2 == 3) {
                System.out.println("this Individual already have choose other!");
            }else {
                System.out.println("wrong!");
            }

        }

        System.out.println("Your order: " + course.getDescription());
        System.out.println("Total price:" + course.cost()+" tg");
    }
}

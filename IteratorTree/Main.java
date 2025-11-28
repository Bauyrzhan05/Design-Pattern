package IteratorTree;

import IteratorTree.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ағаш құрылымы
        TreeNode<String> root = new TreeNode<>("10");
        root.left = new TreeNode<>("8");
        root.right = new TreeNode<>("12");
        root.left.left = new TreeNode<>("6");
        root.left.right = new TreeNode<>("9");
        root.right.left = new TreeNode<>("11");
        root.right.right = new TreeNode<>("15");

        Tree<String> tree = new Tree<>(root);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Traversal:");
            System.out.println("1 - Preorder");
            System.out.println("2 - Inorder");
            System.out.println("3 - Postorder");
            System.out.println("4 - DFS");
            System.out.println("5 - BFS");
            System.out.println("0 - exit");

            System.out.print("Choose: ");
            choice = scanner.nextInt();

            Iterator<String> iterator = null;

            switch (choice) {
                case 1:
                    iterator = new PreorderIterator<>(tree.root);
                    System.out.print("Preorder: ");
                    break;
                case 2:
                    iterator = new InorderIterator<>(tree.root);
                    System.out.print("Inorder: ");
                    break;
                case 3:
                    iterator = new PostorderIterator<>(tree.root);
                    System.out.print("Postorder: ");
                    break;
                case 4:
                    iterator = new DFSIterator<>(tree.root);
                    System.out.print("DFS: ");
                    break;
                case 5:
                    iterator = new BFSIterator<>(tree.root);
                    System.out.print("BFS: ");
                    break;
                case 0:
                    System.out.println("Бағдарлама аяқталды.");
                    break;
                default:
                    System.out.println("Қате таңдау, қайтадан таңдаңыз.");
            }

            if (iterator != null) {
                while (iterator.hasNext()) {
                    System.out.print(iterator.next() + " ");
                }
                System.out.println();
            }

        } while (choice != 0);

        scanner.close();
    }
}

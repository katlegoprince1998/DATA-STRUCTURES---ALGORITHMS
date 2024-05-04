package recursion;

import java.util.Scanner;

public class BasicTreeImpl {
    public BasicTreeImpl(){

    }
    private static class Node{
        private Node left;
        private Node right;
        private final int value;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int num = scanner.nextInt();
        root = new Node(num);
        populate(scanner, root);
    }
    private static void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter the left value of: " + node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the left value of: " + node.value);
            int num = scanner.nextInt();
            node.left = new Node(num);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to add on the right of: " + node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the right value of: " + node.value);
            int num = scanner.nextInt();
            node.right = new Node(num);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root, "");
    }
    private static void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}

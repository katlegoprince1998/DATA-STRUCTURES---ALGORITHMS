package recursion;

public class BST {
    private static class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;
    public BST(){
        this.root = null;
    }
    /** Insert a key into the binary search tree. */
    public void insert(int key) {
        root = insertRec(root, key);
    }

    /** Recursive function to insert a key into the tree. */
    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.value) {
            root.left = insertRec(root.left, key);
        } else if (key > root.value) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // search using a value

    public boolean search(int num){
        return searchRec(root, num);
    }
    private boolean searchRec(Node root, int num){
        if (root == null){
            return false;
        }
        if (num == root.value){
            return true;
        }
        else if(num < root.value){
            return searchRec(root.left, num);
        } else  {
            return searchRec(root.right, num);

        }
    }

    // delete using value

    public void delete(int num){
        root = deleteRec(root, num);
    }
    private Node deleteRec(Node root, int num){
        if (root == null){
            return null;
        }

        if (num < root.value){
            root.left = deleteRec(root.left, num);
        } else if (num > root.value) {
            root.right = deleteRec(root.right, num);
        }else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = minValue(root.right);
            root.right = deleteRec(root.right, root.value);
        }
        return root;
    }

    private int minValue(Node root){
        int minValue = root.value;
        while (root.left != null){
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }
}

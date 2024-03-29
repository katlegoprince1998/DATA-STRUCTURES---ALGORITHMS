package LinkedList.CustomLinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(int size){
        this.size = size;
    }
    public DoublyLinkedList(){}

    public void insertFirst(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if (head != null){
            head.prev = node;
            tail = node;
        }
        head = node;
        size++;
    }
     public void insertLast(int val){
        Node node = new Node(val);

        Node last = head;

        for (int i = 0; i< size - 1; i++){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;
        tail = node;
        size++;
     }

     public int removeFirst(){
        int val = head.value;
        head = head.next;
        head.next.prev = null;
        size--;
        return val;

     }
     public int getHeadValue(){
        return head.value;
     }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println(" " + "END");
        System.out.println(" ");
        System.out.println("Printing in reverse");

        while (last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }


    private class Node{
        private final int value;
        private Node next;
        private Node prev;

        public Node(int value, Node next, Node prev){
            this.next = next;
            this.value = value;
            this.prev = prev;
        }
        public Node(int value){
            this.value = value;


        }
    }
}

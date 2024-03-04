package LinkedList.CustomLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
       DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(12);
        list.insertFirst(15);
        list.insertFirst(52);
        list.insertFirst(75);
        list.insertFirst(100);
        list.display();
        list.insertLast(500);
        list.display();
        System.out.println("The removed value is " + list.removeFirst());
        System.out.println("The head value is " + list.getHeadValue());
        list.display();

    }
}

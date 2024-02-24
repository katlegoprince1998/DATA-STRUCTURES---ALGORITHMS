package LinkedList.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(5);
        list.addFirst(8);
        list.addFirst(10);
        list.addFirst(9);
        list.display();
        list.addLast(14);
        list.display();
        list.addAt(100, 2);
        list.display();
        System.out.println("The removed value is " + list.removeFirst());
        list.display();
        System.out.println("The current value is " + list.getCurrent());
        System.out.println("The next value is " + list.getNextValue());
        System.out.println("The last value removed is " + list.removeLast());
        list.display();
    }


    }


package LinkedList.CustomLinkedList.SinglyLinkedList;

import LinkedList.CustomLinkedList.SinglyLinkedList.CustomLL;

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
        System.out.println("The first removed value is " + list.removeFirst());
        list.display();
        System.out.println("The last value removed is " + list.removeLast());
        list.display();
        System.out.println("The  value removed is " + list.removeAt(4));
        list.display();
        System.out.println("we found " + list.find(150));
        list.display();

    }


    }


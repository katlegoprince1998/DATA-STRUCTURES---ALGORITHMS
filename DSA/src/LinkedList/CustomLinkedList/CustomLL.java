package LinkedList.CustomLinkedList;

public class CustomLL {
    /**
     * All LinkedList have a head and tail
     * I will also maintain the size of the LinkedList
     */

    private Node head;
    private Node tail;
    private int size;

    public CustomLL(){
        this.size = 0;
    }

    //add a node
    public void addFirst(int val){
        Node node = new Node(val); //Instantiate a new node object
        node.next = head; //Set the new node as a new head
        head = node;//Update the head
        if (tail == null){ // check if the tail is null
            tail = head; //if it is, set tail to point to the head
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node{
      private int val;
      private Node next;


      public Node(int val){
          this.val = val;
      }
      public Node(int val, Node next){
          this.val =val;
          this.next = next;
      }
    }
}

/**
 * This class will demonstrate how linked list work internally
 * I aim to understand how the add, remove, insert work internally
 * before I can use the LinkedList provide by java.
 * I will create a custom LinkedList with various methods like
 * add, remove and so on
 */

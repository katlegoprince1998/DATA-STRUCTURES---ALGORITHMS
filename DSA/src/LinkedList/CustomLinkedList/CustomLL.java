package LinkedList.CustomLinkedList;

public class CustomLL{
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


    public void addFirst(int val){
        Node node = new Node(val); //Instantiate a new node object
        node.next = head; //Set the new node as a new head
        head = node;//Update the head
        if (tail == null){ // check if the tail is null
            tail = head; //if it is, set tail to point to the head
        }
    }

    public void addLast(int val){
        if(tail == null){
            addFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void addAt(int val, int index){
        if (index == 0){
            addFirst(val);
        }
        if (index == size){
            addLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }
    public int removeFirst(){
        int val = head.val;;
        head = head.next;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int removeLast(){
        int val = tail.val;
        Node temp = tail;
        for (int i = 0; i < size - 1; i++){
          temp = temp.next;
        }
        tail = temp;
        tail.val = temp.val;
        return val;
    }
    public int getCurrent(){
        return head.val;
    }
    public int getNextValue(){
        head = head.next;
        return head.val;
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

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
        size++;
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
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int removeLast(){
        if (size <= 1){
            return removeFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }

    public int removeAt(int index){
        if (index <= 1){
            return removeFirst();
        }
        if (index == size -1){
            return removeLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;

    }


    private Node get(int index){
        Node node = head;
        for (int m = 0; m < index; m++){
            node = node.next;
        }
        return node;
    }
    public int getCurrent(){
        return head.value;
    }
    public int getNextValue(){
        head = head.next;
        return head.value;
    }


    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
      private int value;
      private Node next;

      public Node(int value){
          this.value = value;
      }
      public Node(int value, Node next){
          this.value =value;
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

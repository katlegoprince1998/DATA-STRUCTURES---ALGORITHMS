package LinkedList.CustomLinkedList.CircllelyLinkedList;

public class CCLinkedList {

    private int size;
    private Node head;
    private Node tail;

    public CCLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }
     
    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            tail = node;
            head = node;
            return;
        }

        tail.next = node;
        node.next = head; 
        tail = node;
        size++;
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
       if(node.value == val){
         head = head.next;
         tail.next = head;
         return;
       }

       do{
        Node currentNode = node.next;
        if(currentNode.value == val){
            node.next = currentNode.next;
            break;
        }
       node = node.next;
      }while(node != head);
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node != head);
            System.out.println("HEAD");
           
        }
    }
 

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

}

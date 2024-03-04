public class CCLinkedList {

    private int size;
    private Node head;
    private Node tail;

    public CCLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    public CCLinkedList(){

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

}

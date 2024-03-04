public class Main {
    public static void main(String[] args) {
        CCLinkedList list = new CCLinkedList();
        list.add(12);
        list.add(15);
        list.add(18);
        list.add(25);
        list.add(1782);
        list.display();
        list.delete(15);
        list.display();
    }

}

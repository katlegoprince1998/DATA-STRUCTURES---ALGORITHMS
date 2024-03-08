package myQueues;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomCircularQueue queue = new CustomCircularQueue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.display();
        queue.remove();
        queue.display();
        System.out.println(queue.front());
    }
    
}

package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(52);
        queue.add(25);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());


    }
    
}

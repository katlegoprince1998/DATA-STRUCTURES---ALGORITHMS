package myQueues;

import java.util.ArrayDeque;
import java.util.Queue;

public class InBuiltQueus {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new ArrayDeque<>();
        myQueue.add(12);
        myQueue.add(25);
        myQueue.add(98);
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println(myQueue);
        myQueue.remove(12);
        
    }

    
}

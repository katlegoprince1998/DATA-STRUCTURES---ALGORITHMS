package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(150);
        deque.add(58);
        deque.addFirst(10);
        deque.addLast(14);

        System.out.println(deque);
    }
    
}

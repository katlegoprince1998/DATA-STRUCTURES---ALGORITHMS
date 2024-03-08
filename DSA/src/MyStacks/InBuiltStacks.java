package MyStacks;

import java.util.Stack;

public class InBuiltStacks{
   public static void main(String[] args) throws Exception{
       Stack<Integer> stack = new Stack<>();

       stack.push(5);
       stack.push(10);
       stack.push(85);
       System.out.println("The stack list is " + stack);
       System.out.println("The removed item is " + stack.pop());

       System.out.println();
       System.out.println("End of in-buitl stacks");
       System.out.println();

       CustomStack customStack = new CustomStack();
       customStack.push(10);
       customStack.push(12);
       customStack.push(15);
       customStack.push(88);
       customStack.push(75);
       customStack.push(20);
       customStack.push(88);

       System.out.println("The pop is " + customStack.pop());
       System.out.println("The peek is "  + customStack.peek());

   }
}
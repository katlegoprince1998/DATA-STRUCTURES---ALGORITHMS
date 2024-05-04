package recursion;

public class PracticeRecursion {
    public static void main(String[] args) {
        message1();
    }
    private static void message1(){
        System.out.println("I will call method 2");
        message2();
    }
    private static void message2(){
        System.out.println("I will call method 3");
        message3();
    }
    private static void message3(){
        System.out.println("I will call method 4");
        message4();
    }
    private static void message4(){
        System.out.println("I will call method 5");
        message5();
    }
    private static void message5(){
        System.out.println("I will not call any method");
    }
}
/***
 * WHAT IS RECURSION
 * -- Is a function that calls its self.
 *
 * WHAT IS HAPPENING INTERNALLY
 * ==The methods are called in stack memory.
 * ----The method will remain in stack memory until it completes executing.
 * ===The first method to be called is the main function.
 * ====Method1 will be called next in stack
 * |||| The methods will be called in order.
 * -----The methods will be removed from stack i the order they came in with.
 */



package recursion;

public class RecursionPractice {
    public static void main(String[] args) {
        message();
    }
    private static void message(){
        System.out.println("Hello");
        message1();
    }
    private static void message1(){
        System.out.println("Hello");
        message2();
    }
    private static void message2(){
        System.out.println("Hello");
        message3();
    }
    private static void message3(){
        System.out.println("Hello");
        message4();
    }
    private static void message4(){
        System.out.println("Hello");
    }
    
}


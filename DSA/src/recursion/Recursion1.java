package recursion;

public class Recursion1 {
    public static void main(String[] args) {
        print(1);
    }
    private static void print(int n){
        System.out.println("The number is " + n);
        if (n == 10){
            System.out.println("THE END");
            return;
        }
        print(n + 1);
    }
}

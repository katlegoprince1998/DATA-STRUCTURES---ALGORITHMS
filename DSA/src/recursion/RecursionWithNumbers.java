package recursion;

public class RecursionWithNumbers {
    public static void main(String[] args) {
        print(1);
    }
    private static void print(int n){
        if(n == 10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
    
}

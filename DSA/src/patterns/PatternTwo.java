package patterns;

public class PatternTwo {
    public static void main(String[] args) {
       pattern2(8);
    }
    static void pattern2(int n){
        int i = 1;
        while (i <= n){
            for (int m = 1; m <= n - i + 1; m++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}

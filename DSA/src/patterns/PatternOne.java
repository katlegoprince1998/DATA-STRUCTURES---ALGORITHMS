package patterns;

public class PatternOne {
    public static void main(String[] args) {
        pattern1(9);
    }
    static void pattern1(int n){
        int i = 1;
        while (i <= n) {
            for (int m = 1; m <= i; m++){
                System.out.print("#");
            }
            System.out.println();
            i++;
        }
    }
}

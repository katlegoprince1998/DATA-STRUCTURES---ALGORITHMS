package patterns;

public class PatternFour {
    public static void main(String[] args) {
      patternFour(9);
    }
    static void patternFour(int n){
        for (int i = 1; i <= n; i++){
            for (int m = 1; m <= i; m++){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

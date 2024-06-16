package patterns;

public class PatternThree {
    public static void main(String[] args) {
        pattern3(7);
    }
    static void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for (int m = 1; m <= n; m++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}

package patterns;

public class PatternFive {
    public static void main(String[] args) {
        patternFive(5);
    }
    static void patternFive(int n){
        for (int row = 1; row <= n * 2; row++){
            int totalColInRow = row > n ? 2 * n - row: row;
            for (int col = 1; col <= totalColInRow; col++){
                System.out.print("&");
            }
            System.out.println();
        }
    }
}

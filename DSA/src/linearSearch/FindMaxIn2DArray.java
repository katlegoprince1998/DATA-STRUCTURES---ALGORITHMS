package linearSearch;

public class FindMaxIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int result = findMax(arr);
        System.out.println(result);
    }

    private static int findMax(int[][] arr) {
        if(arr.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int[] number: arr){
            for(int value : number){
                if(value > max){
                    max = value;
                }
            }
        }
        return max;
    }
}

package linearSearch;

public class FindMinIn2dArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int result = findMin(arr);
        System.out.println(result);
    }
    private static int findMin(int[][] arr) {
        if(arr.length == 0){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int[] number: arr){
            for(int value : number){
                if(value < min){
                    min = value;
                }
            }
        }
        return min;
    }
}

package linearSearch;

public class SearchInARange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int start = 0;
        int end = arr.length - 1;
        int result = linearSearch(arr, target, start, end);
        System.out.println(result);
    }
    private static int linearSearch(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;

        }
        for (int index = start; index <= end; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}

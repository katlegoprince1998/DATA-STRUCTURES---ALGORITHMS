package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 50;
        System.out.println(search(arr, target));
        System.out.println(Arrays.toString(search2(arr, target)));
    }

    //This is a linear search will return true if the target is found else false
    private static boolean search(int[][] arr, int target) {
        if (arr.length == 0){
            return false;
        }
        for (int outer = 0; outer < arr.length; outer++){
           for(int inner = 0; inner < arr[outer].length; inner++){
                 if(arr[outer][inner] == target){
                     return true;
                 }
           }
        }
        return false;
    }

    //This will convert the both the index of the inner loop and the outer loop to an array and return the array
    private static int[] search2(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1, -1};
        }
        for (int outer = 0; outer < arr.length; outer++){
           for(int inner = 0; inner < arr[outer].length; inner++){
                 if(arr[outer][inner] == target){
                     return new int[]{outer, inner};
                 }
           }
        }
        return new int[]{-1, -1};
    }
}

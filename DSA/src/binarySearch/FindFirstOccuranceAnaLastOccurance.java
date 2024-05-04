package binarySearch;

import java.util.Arrays;

public class  FindFirstOccuranceAnaLastOccurance {
    public static void main(String[] args) {
        int target = 8;
        int[] arr = {1,5,6,8,8,6,4,7,5};
        System.out.println(Arrays.toString(find(arr, target)));
        
    }
    private static int[] find(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }
    private static int search(int[] arr, int target, boolean findStartIndex){
        int res = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                res = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid +1;
                }
            }
        }
        return res;
    }
    
}

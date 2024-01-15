package binarySearch;

public class binarySearch {
    // binary search
    // returns the index
    // Algorithm
    // - find the middle element
    // - compare middle element with target
    // - if target is equal to middle element
    // - return middle element index
    // - if target is less than middle element
    // - return binarySearch(arr, target, start, middle - 1)
    // - if target is greater than middle element
    // - return binarySearch(arr, target, middle + 1, end)
    // - return -1
    // Time Complexity
    // - O(log n)
    // Space Complexity
    // - O(1)
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 8;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }


    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

package celling;

public class Floor {
    public static void main(String[] args) {
        int target = 5;
        int[] arr = {2,4,6,8,10,12,14,16,18};
        System.out.println(findFloorOfANumber(arr, target));

    }
    private static int findFloorOfANumber(int[] arr, int target){
    
        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end  = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
              start = mid +1;
            }else{
                return mid;
            }
           
        }
        return end;
    }
    
}

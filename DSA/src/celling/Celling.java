package celling;

public class Celling {
  public static void main(String[] args){
    int target = 13;
    int[] arr = {2,4,6,8,12,15,55};
    System.out.println(findCellingOfANumber(arr, target));

  }
  private static int findCellingOfANumber(int[] arr, int target){
    if(target > arr[arr.length - 1]){
        return -1;
    }
    if(arr.length == 0){
        return -1;
    }

    int start = 0;
    int end = arr.length - 1;

    while(start <= end){
        int mid = start + (end - start)  / 2;
        if(target < arr[mid]){
            end = mid -1;
        }else if (target > arr[mid]){
            start = mid +1;
        }else{
            return mid;
        }
    }
    return start;
  }
}

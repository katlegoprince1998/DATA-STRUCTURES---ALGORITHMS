package linearSearch;
/**
 * Search for a value
 * if value is found
 * ***return the index
 * else
 * ***return -1
 *
 * */
public class LinearSearch {
    public static void main(String[] args) {
        //Array we are going to use to search
      int [] arr = {25, 45, 85, 47, 96, 75, 25, 47, 66 ,22, 44};
      //target element
      int target = 66;
      //call and store the value returned by the linear search function to result
      int result = linearSearch(arr, target);
      //print the result, will return the index if value is found
      System.out.println("The target index is: " + result);
      //call the second search method to return the actual value
      int result2 = linearSearch2(arr, target);
      //print the result
        System.out.println("The target value is: " + result2);
        //call the third search method to return either true or false
        boolean result3 = linearSearch3(arr, target);
        //print the result
        System.out.println("The target value is: " + result3);
    }
    //linear search, return the index
    private static int linearSearch(int[] arr, int target) {
        //check if the array is more than 0
        if(arr.length == 0){
            return -1;
        }
        //Loop through the array and search for the value

        for (int index = 0; index < arr.length; index++) {
            //compare each value with the target
            if(arr[index] == target){
                //return index if value was found
                return index;
            }
        }
        return -1;
    }

    //Linear search, return  the actual value
    private static int linearSearch2(int[] arr, int target) {
        //check if the array is more than 0
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }

    //search and return either true or false; True when the value iks found and false if not found
    private static boolean linearSearch3(int[] arr, int target) {
        //check if the array is more than 0
        if(arr.length == 0){
            return false;
        }
        for(int element: arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}

package LeetCodeChallanges.Easy;
/**
 * Given an array of integers nums and an integer target, return indices of the two        numbers such  that they add up to target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 You can return the answer in any order.
 */
/**
 Steps to solve the problem:
 1. Create a for-loop
 2. Get the index number of the current value
 3. Sum the current index with 1 to get the next index
 4. Sum the value of the two indexes
 5. compare the sum of the indexes with the target
 6. if they are equal, return the indexes
 */
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 26;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
    private static int[] twoSum(int[] nums, int target) {
        if(nums.length ==0){
            return new int[]{};
        }

        for (int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}




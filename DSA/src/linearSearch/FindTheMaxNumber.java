package linearSearch;

public class FindTheMaxNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = findTheMaxNumber(numbers);
        System.out.println(max);
    }
    private static int findTheMaxNumber(int[] numbers) {
        if(numbers.length == 0){
            return -1;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}

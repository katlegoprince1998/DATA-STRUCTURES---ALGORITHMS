package linearSearch;

public class FindTheMinNumber {
    public static void main(String[] args) {

        int[] arr = {122, 255, 355, 45, 51, 16, 557, 558, 54559, 1510, 51211, 1512, 1513, 5451214};
        int answer = findTheMin(arr);
        System.out.println(answer);
    }

    private static int findTheMin(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(answer > arr[i]){
                answer = arr[i];
            }

        }
        return answer;
    }
}

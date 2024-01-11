package linearSearch;
/**
 * This algorithm searches for a character in a string
 * */
public class SearchCharInString {
    public static void main(String[] args) {
        String str = "Katlego";
        char target = 'g';
        boolean result = linearSearch(str, target);
        if(result){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }

    }
    private static boolean linearSearch(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

}

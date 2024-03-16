package conditional;

import java.util.Scanner;

public class IFStatement {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     System.out.println("Enter your name: ");
     String name = scan.nextLine();

     if(name.length() < 10){
        System.out.println("Your name has less than 10 characters");
     }else{
        System.out.println("The name has a correct length");
     }
        /**
         * Syntax
         * if(Condition){Body}
         */

    }
}

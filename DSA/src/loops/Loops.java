package loops;

public class Loops {

  public static void main(String[] args) {
      /**
     * for(initializer; condition, increment){body}
     * Used when you know the number of iterations that must take place
     */
    for(int i = 0; i < 5; i++){
        System.out.print(i + " - > ");
    }
    System.out.println("END");

    /**
     * while(condition){statements}
     * Used when you dont know th number of iterations that nedd to take place
     * 
     */
    int num = 5;
    while(num < 5){
        System.out.print(num++ + " - > ");
        
    }

      /**
   * do-while(condition)
   * the iteration must occur at least once
   */
  int a = 5;
  do{
    System.out.println(a++ + " ");
    
  }while(a < 5);

  }


}

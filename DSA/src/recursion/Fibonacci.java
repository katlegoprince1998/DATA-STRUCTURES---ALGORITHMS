package recursion;

    public class Fibonacci {
        public static void main(String[] args) {
            System.out.println("The nth term is: " + fibo(6));
        }
        private static int fibo(int n){
            if(n < 2){
                return n;
            }
            return fibo(n - 1) + fibo(n - 2);
        }
    }
// WHAT IS HAPPENING INTERNALLY

/***
 * When n is equal 6 (n=6)
 *
 */


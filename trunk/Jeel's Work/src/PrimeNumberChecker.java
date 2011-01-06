
import java.util.Scanner;

public class PrimeNumberChecker {
        
        protected int Prime;
        protected int n;
        protected boolean runAgain = true;
        protected int i;
        public static void main(String[] args) {
                        new PrimeNumberChecker();
        }
        
        public PrimeNumberChecker() {
                 Scanner input = new Scanner(System.in);
                 
                 System.out.println("=================================================================");
                 System.out.println("This program will check whether your number is prime or not.");
                 System.out.println("=================================================================");
                 System.out.print("Enter your number please: ");
                 Prime = input.nextInt();
                 
                for(i = 2; i <= Prime; i++) {
                        n = Prime%i;
                        if(n == 0) {
                                System.out.println("The number " +Prime+ " is not a prime");
                                break;
                        }
                }
                if(i == Prime) {
                        System.out.println("The number " +Prime+ " is a prime");
                }
                
        }
}

import java.util.Scanner;

/**
 * import java.math.*;
 */

/**
 * @author Jeel
 *
 */
public class DECIMALCHECKER {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DECIMALCHECKER();
		
	}
	public DECIMALCHECKER(){
		
		double FirstNumber;
		double secondnumber;
		Scanner inputS = new Scanner(System.in);
		System.out.print("Enter your number :");
		FirstNumber = inputS.nextDouble();
		
		secondnumber = Math.floor(FirstNumber);
		
			
		
			if(secondnumber != FirstNumber){
				System.out.println("The number "+FirstNumber+" is a decimal");
			}else{
				System.out.println("The number "+FirstNumber+" is not a decimal");
			}
	}
}


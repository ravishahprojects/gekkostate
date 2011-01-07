
import java.util.Scanner;

public class OddEven {

	Scanner get = new Scanner(System.in);
	int inputNum;
	int outputNum;
	
	public static void main(String[] args) {
		new OddEven();
		
	}
	
	
	public OddEven() {
		System.out.println("========================================================");
		System.out.println("This program determine if a number is Odd or Even");
		System.out.println("========================================================");
		System.out.print("Please enter your number: ");
		inputNum = get.nextInt();
		
		outputNum = inputNum%2;
		if(outputNum == 0) {
			System.out.println("This is number is even");
		}else {
			System.out.println("This is number is odd");
		}
		
	}
}


import java.util.Scanner;

public class Exercise11 {

	final double pi = 3.14;

	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Exercise11();
		
		
	}
	
	public Exercise11() {
		
		
		System.out.println("This program will calculate the area of a circle");
		System.out.println("how many times would you like to execute this program?");
		int execute = input.nextInt();
		
		for(int i = 0; i <=execute; i++) {
		System.out.println("Please enter the radius of the circle");
		double radius = input.nextDouble();
		double area = pi*Math.pow(radius, 2);
		System.out.println("The area is "+area);
		}
		System.out.println("Thank you for using this program");
	}

}

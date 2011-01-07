

import java.util.Scanner;

public class Takeinput {
	
	double fnum;
	double snum;
	
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		new Takeinput();
	}
	
	public Takeinput() {
		System.out.println("This program will take in 2 numbers and output the sum, difference, product and quotient");
		System.out.print("Please enter your first number: ");
		fnum = input.nextInt();
		System.out.print("Please enter the second number: ");
		snum = input.nextInt();
		
		double sum = fnum + snum;
		double difference = fnum - snum;
		double product = fnum * snum;
		double quotient = fnum/snum;
		
		System.out.println("The sum is: "+sum);
		System.out.println("The difference is: "+difference);
		System.out.println("The product is: "+product);
		System.out.println("The quotient is: "+quotient);
		
	}
}

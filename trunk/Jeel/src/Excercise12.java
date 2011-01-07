

import java.util.Scanner;

public class Excercise12 {
	
	final int currentYear = 2010;
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String[]args) {
		new Excercise12();
	}
	public Excercise12() {
		System.out.println("This program will calculate your current age");
		for (int i = 0; i <=3;i++) {
		System.out.print("Please enter your year of birth: ");
		int birthdate = input.nextInt();
		int age = currentYear - birthdate;
		System.out.println("Your age is "+age);
		System.out.println();
		}
		System.out.println("Thank you for using the program");
	}
}

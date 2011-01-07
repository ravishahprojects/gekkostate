

import java.util.Scanner;

public class Cents {
		
		double cents;
		
		Scanner input = new Scanner(System.in);
	public static void main(String[]args) {
		new Cents();
	}
	
	public Cents() {
		System.out.println("This program will take in how much money you have in cents" +
				"conver it into quaters");
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Please enter your cent amount: ");
		cents = input.nextInt();
		
		double quaters = cents/25;
		double total = Math.floor(quaters);
		double fTotal = cents%25;
		
		System.out.println("You can have "+total+" quaters");
		if(fTotal == 0) {
			System.out.println("No cent leftovers");
		}else {
			System.out.println("You have "+fTotal+" cents leftover");
		}
		
	}
}

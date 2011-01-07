

import java.util.Scanner;
public class MarkhamFencing {

		double length;
		double width;
		double perimeter;
		double cost;
		
		Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		new MarkhamFencing();
			
	}
	public MarkhamFencing() {
		System.out.println("=============================================");
		System.out.println("Markham Fencing is selling chain linked fences for $11/m");
		System.out.println("=============================================");
		System.out.print("Please enter the length of your fence: ");
		length = input.nextDouble();
		System.out.print("Please enter the width of you fence: ");
		width = input.nextDouble();
		
		perimeter = length * 2 + width * 2;
		cost = perimeter * 11;
		
		System.out.println("Total perimeter for fencing is: "+perimeter);
		System.out.println("The total cost will be $"+cost);
		
	}
}

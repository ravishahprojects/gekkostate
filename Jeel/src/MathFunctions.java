

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MathFunctions {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args)throws IOException {
		new MathFunctions();

	}

	public MathFunctions() throws IOException  {
		
		System.out.println("1. Use the Math method POW");
		System.out.println("2. Use the Math method SQRT");
		System.out.println("3. Use the Math method ABS");
		System.out.println("4. Use the Math method ROUND");
		System.out.println("5. Use the Math method SIN");
		System.out.println("6. Use the Math method CEIL");
		System.out.println("7. Use the Math method FLOOR");
		System.out.println("");
		System.out.print("Please enter the option number: ");
		int num = Integer.parseInt(br.readLine());
		
		switch(num){
		case 0:
			
			break;
		case 1:
			System.out.println("You chose the Math method POW.");
			System.out.println("Math.pow is the exponent method of the Math class.");
			System.out.println("It takes two numbers, the first one being the base and the other the exponent.");
			System.out.print("Please enter your first number: ");
			int base = Integer.parseInt(br.readLine());
			System.out.print("Please enter your second number: ");
			int exo = Integer.parseInt(br.readLine());
			double product = Math.pow(base, exo);
			System.out.print("Your answer is "+product);
			break;
		case 2: 
			System.out.println("You chose the Math method SQRT.");
			System.out.println("Math.sqrt is square root method of the Math class.");
			System.out.println("Math.sqrt takes only one parameter.");
			System.out.print("Please enter the number you wish to square root: ");
			int number = Integer.parseInt(br.readLine());
			double sqrt = Math.sqrt(number);
			System.out.println("The square root of "+number+" is "+sqrt);
			break;
			
		case 3: 
			System.out.println("You chose the Math method ABS.");
			System.out.println("Math.abs is absolute value method of the Math class.");
			System.out.println("Math.abs takes only one parameter, it take a negative number and makes it positive.");
			System.out.print("Enter you number please: ");
			int abs = Integer.parseInt(br.readLine());
			double posAbs = Math.abs(abs);
			System.out.println("The answer is "+posAbs);
			break;
			
		case 4:
			System.out.println("You chose the Math method ROUND.");
			System.out.println("Math.round takes a decimal number and rounds it .");
			System.out.println("Math.round takes only one parameter.");
			System.out.print("Enter a number: ");
			double Round = Double.parseDouble(br.readLine());
			double product1 = Math.round(Round);
			System.out.println(product1);
			break;
		case 5:
			System.out.println("You chose the Math method SIN.");
			System.out.println("Math.sin takes only one parameter.");
			System.out.print("Enter a number: ");
			double input = Double.parseDouble(br.readLine());
			double sine = Math.sin(input);
			System.out.println("The answer is "+sine);
			break;
		case 6:
			System.out.println("You chose the Math method CEIL");
			System.out.print("Please enter a number: ");
			double ce = Math.ceil(Double.parseDouble(br.readLine()));
			System.out.println("The answer is "+ce);
			break;
		case 7:
			System.out.println("You chose the Math method FLOOR");
			System.out.println("This rounds the number down.");
			System.out.println("Please enter the number: ");
			double floo = Math.floor(Double.parseDouble(br.readLine()));
			System.out.println("The floored number is: "+floo);
			break;
		}
	}
}


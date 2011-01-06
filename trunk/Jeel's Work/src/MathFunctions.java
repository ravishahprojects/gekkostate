

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
		System.out.print("How many times would you like to run the program: ");
		int run = Integer.parseInt(br.readLine());
		
		
		for(int i = 1;i<=run;i++) {
			System.out.print("Please enter the option number: ");
			int num = Integer.parseInt(br.readLine());
			
		switch(num){
		case 0:
			
			break;
		case 1:
			System.out.print("Please enter your first base: ");
			double base = Double.parseDouble(br.readLine());
			System.out.print("Please enter your second exponent: ");
			double exo = Double.parseDouble(br.readLine());
			double product = Math.pow(base, exo);
			System.out.print("Your answer is "+product);
			break;
		case 2: 
			
			System.out.print("Please enter the number you wish to square root: ");
			double number = Double.parseDouble(br.readLine());
			double sqrt = Math.sqrt(number);
			System.out.println("The square root of "+number+" is "+sqrt);
			break;
			
		case 3: 
			
			System.out.print("Enter you number please: ");
			double abs = Math.abs(Double.parseDouble(br.readLine()));
			
			System.out.println("The answer is "+abs);
			break;
			
		case 4:
			System.out.println("You chose the Math method ROUND.");
			System.out.print("Enter a number: ");
			double Round = Double.parseDouble(br.readLine());
			double product1 = Math.round(Round);
			System.out.println(product1);
			break;
		case 5:
			System.out.println("You chose the Math method SIN.");  
			System.out.print("The input will be in radians if you would like to use degrees press D or just press any letter: ");
			String s = br.readLine();
			if(s.equalsIgnoreCase("d")){
			    System.out.println("Please enter your number: ");
			    double d1 = Math.sin(Math.toDegrees(Double.parseDouble(br.readLine())));
			    System.out.println("The answer is "+d1);
			}else {
				System.out.print("Please enter your number(this will be in radians): ");
				double input = Math.sin(Double.parseDouble(br.readLine()));
				 System.out.println("The answer is "+input);
			}
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
			System.out.println("Please enter the number: ");
			double floo = Math.floor(Double.parseDouble(br.readLine()));
			System.out.println("The floored number is: "+floo);
			break;
		}
	}
}
}


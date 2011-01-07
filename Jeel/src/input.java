import java.util.Scanner;

public class input {
	public static void main(String args[]) {
		Scanner Jeel = new Scanner(System.in);
		String input;
		double yes;
		double age;
		double born;
		double year;
		
		double again1;

		System.out.println("hi this program will ask you questions and you must reply accordingly");
		System.out.println("Please enter your name here: ");
		input = Jeel.nextLine();
		System.out.println("Hello " + input);
		System.out.println("Please enter your age here:");
		age = Jeel.nextDouble();

		if (age > 18) {
			System.out.println("Finally a adult! ");
		} else {
			System.out.println("Your are teenager eh?");
		}

		System.out.println("your age is " + age);
		System.out.println("Please type in the current year: ");

		year = Jeel.nextDouble();
		System.out.println("If you are " + age);
		System.out.println("and the current year is " + year);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("then you must be born in the year");
		born = age - year;
		
		System.out.println(born);
		System.out.println("The program will now tell you a fact about the time period your were born in");
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e){
			e.printStackTrace(); 
		}
		System.out.print(" ,the program will tell the fact in the 10 year range");
		System.out.println("If your age is " + age);
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("then please enter the number 1 , if your age is not :"+age);
		System.out.print("please enter the number 2");
		
		yes = Jeel.nextDouble();
		if (yes == 1) {
			System.out
					.println("Confirmation Complete the program will commence now");
		} else {
		      System.out.println("if your age is not"+age);
		      System.out.println("then please enter it here: ");
		} 		again1 = Jeel.nextDouble();	
              if(again1 == 15){
		 System.out.println("Did you know that in 1995 Jeel Shah was born?");  
              }else{
            	  System.out.print("you suck");
              }
	}

}

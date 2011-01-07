import java.util.Scanner;
public class Logicaloperaters {
	public static void main(String args[]){
		
		
		Scanner jeel= new Scanner(System.in);
		
		
		double age;
		double born; 
		@SuppressWarnings("unused")
		double gen; 
		
		System.out.println("Enter your gender here:");
		gen = jeel.nextDouble();
		System.out.println("Enter your age here:");
		age = jeel.nextDouble(); 
		System.out.println("The program will now calculate now calculate when you were born");
		born = age - 2009; 
		System.out.print("You were born in ");
		System.out.print(born);
	}
}

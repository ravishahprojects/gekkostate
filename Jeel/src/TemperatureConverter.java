import java.util.*;
public class TemperatureConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double num;
		double num2;
		
		Scanner Jeel = new Scanner(System.in);
		System.out.println("This will convert Celsius to Farehenheit");
		System.out.println("Enter your num: ");
		num = Jeel.nextDouble();
		
		num2 = num * 9/5+32;
		
		System.out.println(num2);
		

	}

}
// C° = (F° - 32)/9 x 5 
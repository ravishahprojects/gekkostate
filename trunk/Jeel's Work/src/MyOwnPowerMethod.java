

import java.io.*;

public class MyOwnPowerMethod {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		new MyOwnPowerMethod();

	}
	
	public MyOwnPowerMethod() throws IOException{
		
		print("====================================");
		print("This program will calculate any power.");
		print("====================================");
		log("Please enter the base: ");
		double base = Double.parseDouble(br.readLine());
		log("Please enter the exponent: ");
		double exponent = Double.parseDouble(br.readLine());
		
		log("The answer is ");
		power(base,exponent);
		
	}
	
	public static double power(double base,double exponent) {
		double power = 1;
		
		for (int i = 1;i <= exponent;i++) {
			power = power * base;
		}
		System.out.println(power);
		return power;
	}
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void log(String s) {
		System.out.print(s);
	}
}

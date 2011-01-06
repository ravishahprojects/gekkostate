

import java.io.*;
import java.text.*;

public class CentiToInchesMethod {

	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[] args) throws IOException {
		new CentiToInchesMethod();
	}
	
	public CentiToInchesMethod() throws IOException {
		print("==================================================");
		print("This program will convert centimeters to inches");
		print("=================================================");
		log("Please enter the centimeter amount: ");
		double cent = Double.parseDouble(br.readLine());
		convert(cent);
	}
	public static double convert(double cent) {
		
		double inch = 0.393700787;
		double ConvertV = cent * inch;
		print("The converted value is: "+df.format(ConvertV)+" inches");
		return ConvertV;
	}
	
	// System.out.println;
	public static void print(String s) {
		System.out.println(s);
	}
	
	// System.out.print;
	public static void log(String s) {
		System.out.print(s);
	}
}

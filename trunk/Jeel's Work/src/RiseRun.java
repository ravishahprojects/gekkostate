

import java.io.*;
import java.text.*;

public class RiseRun {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException {
		
		new RiseRun();

	}
	
	public RiseRun()throws IOException {
		print("===============================================================");
		print("This program will calculate the slope of a line using two points");
		print("================================================================");
		log("Please enter your x value: ");
		double x = Double.parseDouble(br.readLine());
		log("Please enter your y value: ");
		double y = Double.parseDouble(br.readLine());
		log("Please enter your x2 value: ");
		double x2 = Double.parseDouble(br.readLine());
		log("Please enter your y2 value: ");
		double y2  = Double.parseDouble(br.readLine());
		convert(x,y,x2,y2);
	}
public static double convert(double x,double y,double x2,double y2) {
		
		double ror = (y2 - y)/(x2 - x);
		
		
		
					
		
			System.out.println("The slope is "+ror);
		
		return ror;
	}
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void log(String s) {
		System.out.print(s);
	}
}

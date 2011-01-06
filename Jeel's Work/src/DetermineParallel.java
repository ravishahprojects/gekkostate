

import java.io.*;

public class DetermineParallel {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[]args) throws IOException {
		
		System.out.println("==============================================================");
		System.out.println("This program will determine if two line segments are parallel");
		System.out.println("==============================================================");
		System.out.print("Please enter how many times you would like to run the program: ");
		int run = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= run; i++) {
			System.out.println("Please start by entering the values of the first line segment");
			System.out.print("Please enter your x value: ");
			double x = Double.parseDouble(br.readLine());
			System.out.print("Please enter your y value: ");
			double y = Double.parseDouble(br.readLine());
			System.out.print("Please enter your x2 value: ");
			double x2 = Double.parseDouble(br.readLine());
			System.out.print("Please enter your y2 value: ");
			double y2  = Double.parseDouble(br.readLine());
			System.out.println("Line one complete");
			System.out.println("-------------------------------------");
			System.out.println("Please start by entering the values of the second line");
			System.out.print("Please enter your x value: ");
			double p = Double.parseDouble(br.readLine());
			System.out.print("Please enter your y value: ");
			double p1 = Double.parseDouble(br.readLine());
			System.out.print("Please enter your x2 value: ");
			double p2 = Double.parseDouble(br.readLine());
			System.out.print("Please enter your y2 value: ");
			double p3  = Double.parseDouble(br.readLine());
			System.out.println("Line two complete");
			convert(x,y,x2,y2,p,p1,p2,p3);
		}
		
	}
	
	public static double convert(double x,double y,double x2,double y2,double p,double p1,double p2,double p3) {
		
		double ror = y2 - y/x2 - x;
		double ror2 = p1 - p/p3 - p2;
		
		
		if(ror == ror2) {
			System.out.println("The line is parallel");
		}else {
			System.out.println("The line is not parallel");
		}
		return ror;
	}
}



import java.io.*;
import java.text.DecimalFormat;

public class DistanceMethod {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[] args) throws IOException {
		new DistanceMethod();

	}
	
	public DistanceMethod() throws IOException {
		print("===============================================================");
		print("This program will calculate the distance between two points");
		print("================================================================");
		log("Please enter your x value: ");
		double x = Double.parseDouble(br.readLine());
		log("Please enter your y value: ");
		double y = Double.parseDouble(br.readLine());
		log("Please enter your x2 value: ");
		double x2 = Double.parseDouble(br.readLine());
		log("Please enter your y2 value: ");
		double y2  = Double.parseDouble(br.readLine());
		distance(x,y,x2,y2);
	}
	public static double distance(double x,double y,double x2,double y2) {
		double distance = 0;
		double Tx = 0;
		double Ty = 0;
		Tx = Math.pow(x - x2, 2);
		Ty = Math.pow(y - y2,2);
		distance = Math.sqrt(Tx + Ty);
		System.out.println("The distance between the points is "+df.format(distance));
		return distance;
	}
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void log(String s) {
		System.out.print(s);
	}
}


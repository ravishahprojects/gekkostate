
import java.util.Scanner;

public class CalculateDistancePoint {

	Scanner input = new Scanner(System.in);
	double x;
	double y;
	double x2;
	double y2;
	double fx;
	double fy;
	double Sdistance;
	double distance;
	
	public static void main(String[] args) {
		new CalculateDistancePoint();
		
	}
	
	public CalculateDistancePoint() {
		System.out.println("===============================================================================");
		System.out.println("This program will calculate the distance between two points \n(x,y) and (x2,y2)");
		System.out.println("===============================================================================");
		System.out.print("Please enter the x value: ");
		x = input.nextInt();
		System.out.print("Please enter the y value: ");
		y = input.nextInt();
		System.out.print("Please enter the x2 value: ");
		x2 = input.nextInt();
		System.out.print("Please enter the y2 value: ");
		y2 = input.nextInt();
		
		fx = x2 - x * fx;
		fy = y2 - y * fy;
		
		Sdistance = fx * fx + fy  * fy;
		distance = Math.sqrt(Sdistance);
		
		System.out.println("The distance between the two points is: "+distance+" units");
		
	}
}

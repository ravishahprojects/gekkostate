import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Rightangle {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
            System.out.println("============================================================================");
            System.out.println("This program will check if a triangle is right angle or not.");
            System.out.println("============================================================================");
            System.out.print("How many times would you like to run this program? ");
            int run = Integer.parseInt(br.readLine());
            
            for(int i = 1;i<=run;i++) {
                    System.out.println("We will begin with the first line.");
                    System.out.print("Please enter the x coordinate: ");
                    double x = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the y coordinate: ");
                    double y = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the x2 coordinate: ");
                    double x2 = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the y2 coordinate: ");
                    double y2 = Double.parseDouble(br.readLine());
                    System.out.println("Now please start entering the cordniates for the second line.");
                    System.out.print("Please enter the x value of the second line: ");
                    double p = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the y value of the second line: ");
                    double p2 = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the x2 value of the second line: ");
                    double p3 = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the y2 value of the second line: ");
                    double p4 = Double.parseDouble(br.readLine());
                    System.out.println("Now please start entering the cordniates for the third line: ");
                    System.out.print("Please enter the x value for the third line: ");
                    double i1 = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the y value of the third line: ");
                    double i2 = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the x2 value of the third line: ");
                    double i3 = Double.parseDouble(br.readLine());
                    System.out.print("Please enter the y2 value of the third line: ");
                    double i4 = Double.parseDouble(br.readLine());
                    cal(x,y,x2,y2,p,p2,p3,p4,i1,i2,i3,i4);
            }
    }
    
    public static double cal(double x,double y,double x2,double y2,double p,double p2,double p3,double p4,double i1,double i2,double i3,double i4) {
    	double ror = (y2 - y)/(x2 - x);
    	double ror1 = (p4-p2)/(p3-p);
    	double ror2 = (i4-i2)/(i3-i1);
		
		if(ror == ror1||ror == ror2||ror1 == ror2) {
			System.out.println("The triangle is a right angle triangle.");
		}else {
			System.out.println("The triangle is not a right angle triangle.");
		}
            return p4;
    }
}

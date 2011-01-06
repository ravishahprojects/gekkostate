
import java.io.*;
public class MidpointNumline {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		System.out.println("==========================================================================");
		System.out.println("This program will give you the midpoint of two numbers on a number line ");
		System.out.println("==========================================================================");
		System.out.print("Please enter the first number: ");
		double fnum = Double.parseDouble(br.readLine());
		System.out.print("Please enter the second number: ");
		double snum = Double.parseDouble(br.readLine());
		
		midpoint(fnum,snum);
	}
	
	public static double midpoint(double fnum,double snum) {
	
		double answer = (fnum + snum)/2;
		System.out.println("The midpoint is "+answer);
		return answer;
	}
}


import java.io.*;
import java.text.*;

public class CentigradeFarenheit {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[] args) throws IOException {
		new CentigradeFarenheit();

	}
	
	public CentigradeFarenheit() throws IOException {
		System.out.println("===================================================");
		System.out.println("This program will convert Centigrade to Farenheit");
		System.out.println("===================================================");
		System.out.print("Please enter the Centigrade value: ");
		double centi = Double.parseDouble(br.readLine());
		convert(centi);
	}
	
	public static double convert(double centigrade) {
		
		double far = centigrade * 9/5 + 32;
		System.out.println(centigrade+" degrees in farenheit is "+df.format(far)+" degrees");
		return far;
	}
}

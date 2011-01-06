

import java.text.DecimalFormat;


public class Generate {
		
	static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[]args) {
		
		for(int i = 50; i <= 65; i++) {
			convert(i);
			
		}
	}
	public static double convert(double centigrade) {
		
		double far = centigrade * 9/5 + 32;
		System.out.println(centigrade+" degrees in farenheit is "+df.format(far)+" degrees");
		return far;
	}
}

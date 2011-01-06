

import java.io.*;
import java.text.*;

public class KBToBytes {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[] args) throws IOException{
		new KBToBytes();
	}
	
	public KBToBytes() throws IOException {
		System.out.println("================================================");
		System.out.println("This program will convert kilobytes to bytes");
		System.out.println("================================================");
		System.out.print("Please enter the Kilobytes: ");
		double kb = Double.parseDouble(br.readLine());
		convert(kb);
		
	}
	public static double convert(double kb) {
		
		double bytes = kb * 1000;
		System.out.println(kb+" kb is "+bytes+" bytes");
		return bytes;
	}
}

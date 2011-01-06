import java.io.*;

public class Asterisk_Triangle {

	
	
	public static void main(String[] args) throws IOException {
		Triangle(5);

	}
	
	public static void Triangle(int run) {
		for(int row = 0;row<=run;row++) {
			
			for(int i = 1;i<=row;i++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	} 
}


public class TprintRectangle {
	
	public static void main(String[]args) {
		
		printRectangle(8,2);
		
	}
	// run is the same as the height
	public static void printRectangle(double width,double run) {
		
		for(int row = 1;row<=run;row++) {
			
			for(int i = 0;i<=width;i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

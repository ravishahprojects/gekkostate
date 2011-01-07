

public class AsterixTriangle {
	

	
	public static void main(String[] args) {
		
		createTriangle(4);
		
	}
	public static void createTriangle(int run) {
		
		for(int i =0;i<=run;i++) {
			
			for(int s = 0;s<=i;s++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

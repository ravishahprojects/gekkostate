import java.util.Random;


public class asdfj {
	
	static Random rand;
	
	public static void main(String[]args) {
		
		for(int i = 1;i<=24;i++) {
		int random = rand.nextInt(6);
		
		switch(random) {

		case 0:
			System.out.print(" R ");
			
			break;
		
		case 1:
			System.out.print(" U ");
		
			break;
			
		case 2:
			System.out.print(" F ");
			break;
		
		case 3:
			System.out.print(" B ");
			break;
			
		case 4:
			System.out.print(" L ");
			break;
		case 5:
			System.out.print(" D ");
			
			default:
				System.out.println("\'");
			}
		}
	}
}

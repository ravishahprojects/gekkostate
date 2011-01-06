import java.util.Random;

public class Scrambler {
	
	static String[] array = {"R","F","L","D","B","U"};
	static Random rand = new Random(5);
	public static void main(String[]args) {
		
		for (int i = 0; i<=24;i++) {
			int i1 = rand.nextInt();
			System.out.println(array[i1]);
		}
		
	}
	
}

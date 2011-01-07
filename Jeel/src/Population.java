
public class Population {
	
	public static void main(String[]args) {
		
		int[] array = new int[101];
		
		
		for(int i = 0;i <= 100; i++) {
			
			array[i] = i;
		}
		System.out.println("Getting population...");
		for(int i = 0; i < array.length;i++) {
			System.out.println("The population is "+array[i]+" people");
		}
	}
}

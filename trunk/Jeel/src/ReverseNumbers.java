
public class ReverseNumbers {
	
	int[] ray = {2,5,9,7,6};
	int i;
	
	public static void main(String[]args) {
		new ReverseNumbers();
	}
	public ReverseNumbers() {
		
		for(i = ray.length-1; i < 0;i--) {
		
			System.out.println(ray[i]);
		}
		
		System.out.println("Jeel");
	}
}

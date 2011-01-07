

public class OrderAlphabet {
	
	String[] ray = {"b","c","d","a","f"};
	int[] array = new int[ray.length];
	
	
	StringBuffer sb = new StringBuffer();
	
	public static void main(String[]args) {
		new OrderAlphabet();
	}
	
	public OrderAlphabet() {
		for(int i = 0;i<=ray.length-1;i++) {
			
			ray[i] = Integer.toHexString(array[i]);
			
			
			System.out.println(ray[i]);
		}
	}
}

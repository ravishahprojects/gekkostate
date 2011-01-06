

public class SumofMultiples {

	static int sum;
	static int product;
	static int i;
	static int i2;
	
	public static void main(String[] args) {
		
		while(i < 1000) {
			if (i%3 == 0) {
	        
	            sum += i;
	        }
	        i++;
		}
		while(i2 < 1000) {
			if (i2%5 == 0) {
		        
	            product += i2;
	        }
			i2++;
		}
		System.out.println(product);
		System.out.println(sum);
	}
	
}

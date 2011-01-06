
public class Rercurison {

	
	public static void main(String[] args) {
		
		System.out.println(Calculate(6));
		
	}
	
	public static long Calculate(long n) {
		
		if(n == 1) {
			return n;
		}else {
			return n = n*Calculate(n-1);
		}
		
	}

}

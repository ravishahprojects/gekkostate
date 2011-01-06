
public class HighLow {
	
	// need to save the lowest number
	static int temp;
	
	public static void main(String[] args) {
		
		FindHighLow(2,9,5);
		
	}
	
	public static void FindHighLow(double a,double b,double c) {
		
		// A is the highest number (1.)
		// B is the second highest (2.)
		// C is the third highest  (3.)
		
		if(a < b) {
			b = a;
			a = temp;
		}else if(a < c) {
			c = a;
			a = temp;
		}else {
			b = c;
			c = temp;
		}
		System.out.println(a+" "+b+" "+c);
	}

}

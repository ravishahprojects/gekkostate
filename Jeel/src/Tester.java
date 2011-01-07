import static java.lang.System.out;

public class Tester {
	static int size = 0;
	public static void main(String[]args) {
		
		
		setSize(5);
		
		out.println("The size is "+getSize());
	}
	public static void setSize(int s) {
		size = s;
	}
	public static int getSize() {
		return size;
	}
}

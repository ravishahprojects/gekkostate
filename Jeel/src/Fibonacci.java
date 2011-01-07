
public class Fibonacci {

	public static void main(String[] args) {
		new Fibonacci(1, 2);
	}

	public Fibonacci(int start, int count) {
		System.out.println("Start from : " + start + " upto " + count
				+ " numbers");
		int var1 = 0, var2 = start;
		for (int i = 0; i <= count; i++) {
			if (var1 > 0)
				System.out.print(var1 + "  ");
			int temp = var2 + var1;
			var1 = var2;
			var2 = temp;
		}
	}
}
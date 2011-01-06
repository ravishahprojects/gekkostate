import java.io.*;

public class aPerimeter {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		System.out.print("Enter the width: ");
		double width = Double.parseDouble(br.readLine());
		System.out.print("Enter the length: ");
		double length = Double.parseDouble(br.readLine());
		areaPerimeter(width,length);
	}
	public static void areaPerimeter(double base,double height) {
		 
		double area;
		double perimeter;
		
		area = base * height;
		perimeter = (base*height)*2;
		
		System.out.println("The area is: "+area);
		System.out.println("The perimeter is: "+perimeter);
	}

}

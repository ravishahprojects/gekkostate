import java.io.*;

public class file {
		public static void main(String[]args){
			
			File x = new File("C:\\x\\java.txt");
			
			if(x.exists())
				System.out.println(x.getName()+ " exist!");
			else
				System.out.println("It does not exist");
		}
}

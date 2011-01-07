
import java.io.*;

public class RegularExpression {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static String ravi = "Ravi";
	static String shah = "Shah";
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("Please enter a sentence.");
		String sentence = br.readLine();
		
		int location = sentence.indexOf(ravi);
		int location1 = sentence.indexOf(shah);
		
		System.out.println(location);
		System.out.println(location1);
		
		if(location == -1 && location1 == -1) {
			System.out.println("They are not in the sentence");
		}else {
			System.out.println("They are in the sentence");
		}
		
	}

}

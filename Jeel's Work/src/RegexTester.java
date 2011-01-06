import java.io.*;
import java.util.regex.*;

public class RegexTester {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean found = false;
	 
	public static void main(String[]args) throws IOException {
		
		System.out.print("How many times would you like to run this program: ");
		int run = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= run; i++) {
			
			System.out.print("Enter your regex: ");
			Pattern pattern = Pattern.compile(br.readLine(),Pattern.CASE_INSENSITIVE);
	        
			System.out.print("Please enter the string of text: ");
			Matcher matcher = 
	            pattern.matcher(br.readLine());
			
			while(matcher.find()) {
				System.out.printf("I found the text \"%s\" starting at " +
		                   "index %d and ending at index %d.%n",
		                    matcher.group(), matcher.start(), matcher.end());
				found = true;
			}
			if(found == false) {
				System.out.println("No match found.");
			}
		}
	}
}

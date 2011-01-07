import java.util.Scanner;
import java.io.*;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			new Palindrome();
	}
	public Palindrome() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String words;
		String is = "The word is palindrome.";
		String not = "The word is not palindrome.";
		
		System.out.println("========================================================");
		System.out.println("This program will check if the word is palindrome or not. ");
		System.out.println("========================================================");
		System.out.print("How many times would you like to run the program?: ");
		int run = Integer.parseInt(br.readLine());
		
		for(int i = 1;i <= run;i++) {
			System.out.print("Enter your word: ");
			words = br.readLine();
			StringBuffer sb = new StringBuffer(words).reverse(); 
			String strRev = sb.toString(); 
			
			if(words.equalsIgnoreCase(strRev)){
				System.out.println(is);
			}else{
				System.out.println(not);
			}
			System.out.println("----------------------------------");
		}
	}
		
}
	 


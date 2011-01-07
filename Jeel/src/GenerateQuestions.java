
import java.util.Scanner;
import java.util.Random;

public class GenerateQuestions {

	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	int[] array = new int[11];
	int count = 0;
	
	
	public static void main(String[] args) {
		new GenerateQuestions();

	}
	
	public GenerateQuestions() {
		System.out.println("=============================================================");
		System.out.println("This program will generate 10 random addition questions.");
		System.out.println("=============================================================");
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		
		for(int i = 1; i<=10 ;i++) {
			int numbers = rand.nextInt(10);
			int Snumber = rand.nextInt(10);
			
			System.out.print("Question "+i+": "+numbers+" + "+Snumber+" = ");
			array[i] = input.nextInt();
			
			if(array[i] - Snumber == numbers) {
				
				count += 1;
			}else {
				
			}
			
		}
		System.out.println("Test Complete");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(name+", You answered questions "+count+" correctly.");
		
	}
}

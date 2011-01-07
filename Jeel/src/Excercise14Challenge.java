import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Excercise14Challenge {
	
	private Random rand = new Random();
	private int[] array;
	private int count = 0;
	private int range;
	private int wrongQuestion;
	private long startT;
	private long endT;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		new Excercise14Challenge();
	}
	
	public Excercise14Challenge() throws IOException {
		System.out.println("=============================================================");
		System.out.println("This program will generate random addition questions.");
		System.out.println("=============================================================");
		
		System.out.print("Please enter your name: ");
		String name = br.readLine();
		
		System.out.print("Enter the amount of questions you would like: ");
		int amount = Integer.parseInt(br.readLine());
		
		System.out.print("Please enter the range you would like the numbers in e.g 0-25: ");
		try {
			range = Integer.parseInt(br.readLine());
		}catch(Exception e) {
			System.out.println("Please enter only one number!");
			System.out.println("Restart.....");
			new Excercise14Challenge();
		}
		
		//Start the timer
		startT = System.currentTimeMillis();
		array = new int[amount]; // Moved out of the loop.
		for(int i = 0; i< amount ;i++) { // Removed = from <=
			int numbers = rand.nextInt(range);
			int numberS = rand.nextInt(range);
			
			System.out.print("Question "+i+": "+numbers+" + "+numberS+" = ");
			array[i] = Integer.parseInt(br.readLine());
			
			if(array[i] - numberS == numbers) {
				count += 1;
			}else {
				
			}
		}
		
		// the end time
		endT = System.currentTimeMillis();
		// calculate how long it took in seconds
		long finalT = (endT - startT)/1000;
		
		System.out.println("Test Complete....");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.err.println(e);			
		}
		if(count == amount) {
			System.out.println(name+", You answered all of the questions correctly.("+count+")");
			System.out.println(name+",it took you about "+finalT+" seconds to complete the test.");
		}else {
			System.out.println(name+",it took you about "+finalT+" seconds to complete the test.");
			System.out.println(name+", You answered only "+count+" questions correctly.");
		}
	}
}
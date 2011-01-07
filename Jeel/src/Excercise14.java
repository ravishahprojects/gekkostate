

import java.util.Random;
import java.util.Scanner;

public class Excercise14 {
	
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	int[] array = new int[11];
	int count = 0;
	
	public static void main(String[] args) {
		new Excercise14();

	}
	
	public Excercise14() {
		System.out.println("=============================================================");
		System.out.println("This program will generate 10 random addition questions.");
		System.out.println("=============================================================");
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		
		for(int i = 1; i<=10 ;i++) {
			int numbers = rand.nextInt(10);
			int numberS = rand.nextInt(10);
			
			System.out.print("Question "+i+": "+numbers+" + "+numberS+" = ");
			array[i] = input.nextInt();
			if(array[i] - numberS == numbers) {
				
				count += 1;
			}else {
				
			}
			
		}
	
		System.out.println("Test Complete....");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		if(count == 10) {
			System.out.println(name+", You answered all of the questions correctly.("+count+")");
		}else {
			System.out.println(name+", You answered only "+count+" questions correctly.");
		}
	}
}

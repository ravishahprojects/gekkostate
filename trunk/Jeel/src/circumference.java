////calculator by Jeel shah //////
///jeel_rocks@hotmail.com   //////
//////////////////////////////////

import java.util.Scanner; 
import java.lang.Math;
public class circumference {
	public static void main (String args[]) {
		double radius;
		double circumference; //// variables <------------------
		
		Scanner jeel = new Scanner (System.in); ///////// telling java about Scanner variable
		
		System.out.println ("The program will calculate the circumfernce for you.");
		
		try {
			Thread.sleep(1000);
		}catch
		(InterruptedException e)  {
		///// this is to pause script//////
			e.printStackTrace();
		}
		
		System.out.println ("Please enter your radius here: ");
		radius = jeel.nextDouble();
		///////make it a bit more realistic
		try {
			Thread.sleep(1000);
		}catch 
		(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Computing");
		//// calculation bit/////
		circumference = 2 * Math.PI * radius;
		try {
			Thread.sleep(500);
		}catch
		(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The circumference is "+circumference+".");	
		////// thats it
		
	}
}


































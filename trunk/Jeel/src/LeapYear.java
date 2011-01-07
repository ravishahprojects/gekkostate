import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		new LeapYear();
	}
		public LeapYear(){
			int year;
			
			
			Scanner Jeel = new Scanner(System.in);
			
			System.out.println("This program will determine leap years according to Gregorian calendar");
			System.out.print("Enter your year: ");
			year = Jeel.nextInt();
			
			try{
				System.out.println("Processing.....");
				Thread.sleep(1000);
			}catch(Exception e){
				
				}
			
			GregorianCalendar calendar = new GregorianCalendar();
		     if(calendar.isLeapYear(year)){
		    	 System.out.println("The year "+year+" is a leap year.");
		     }else{
		    	 System.out.println("The year "+year+" is not a leap year.");
		     }
		}
}

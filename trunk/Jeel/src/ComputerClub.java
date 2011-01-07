
import java.util.Scanner;

public class ComputerClub {
	
	Scanner input = new Scanner(System.in);
	String member;

	double Mamount;
	double amount;
	double mCost;
	double cost;
	public static void main(String[]args) {
		new ComputerClub();
	}
	
	public ComputerClub() {
		System.out.println("=========================================");
		System.out.println("Computer Club sells disks. If you are a member disk cost is 4$/disc \n and if your not a member it is $6/disc.");
		System.out.println("=========================================");
		System.out.print("Are you member? (Y/N): ");
		member = input.nextLine();
		if(member.equalsIgnoreCase("Y")) {
			System.out.print("Please enter the amount of discs you would like to buy: ");
			Mamount = input.nextDouble();
			mCost = Mamount * 4;
			System.out.println("The price for "+Mamount+" discs will be "+mCost);
		}else {
			System.out.println("Since you are not a member the charge is $6/disc");
			System.out.print("Please enter the amount of discs you would like to buy: ");
			amount = input.nextDouble();
			cost = amount * 6;
			System.out.println("The price for "+amount+" discs will be "+cost);
		}
	}
}

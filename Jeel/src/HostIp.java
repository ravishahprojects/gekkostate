/**
 * @author Jeel
 * */
import java.util.Scanner;
import java.net.*;

public class HostIp {

	/**
	 * @param args
	 */
	// Declare String Variables
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String host;
		
		System.out.println("--------------------------------------------------------->");
		System.out.println("This is program will give you the IP address of a host.");
		System.out.println("--------------------------------------------------------->");
		
		System.out.println("Enter your host name please(include www etc): ");
		host = sc.nextLine();
		
		try{
			InetAddress[] address = InetAddress.getAllByName(host);
			for(InetAddress ip : address){
				System.out.println(ip.toString());
			}
		}catch(Exception e){
			System.out.println("Cannot find host ");
		}while(doAgain());
	}
	private static boolean doAgain(){
		System.out.println();
		String s;
		Scanner se = new Scanner(System.in);
		while(true){
			System.out.println("Look up another Y or N");
			s = se.nextLine();
			if(s.equalsIgnoreCase("Y")){
				return true;
			}else if (s.equalsIgnoreCase("N")){
				System.out.println("Program Terminated");
				return false;
			}
		}
	}
}

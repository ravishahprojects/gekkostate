import java.io.*;
import java.util.ArrayList;
import static java.lang.System.out;

public class IP_to_Country {
	
	public static void main(String[] args) throws IOException {
	
		new IP_to_Country();

	}
	public IP_to_Country() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		out.print("Please enter your IP Address: ");
		String ip = br.readLine();
		
		get_IPNumber(ip);
	}
	
	public void get_IPNumber(String s) {
		
		ArrayList<Integer> IPnumbers = new ArrayList<Integer>();
		
		String[] ipSplitNumbers = s.split("\\.");
		
		if(ipSplitNumbers.length > 3 ) {
			System.err.println("Please enter a valid IP Address");
		}else {
			for(int i = 0;i<ipSplitNumbers.length;i++) {
				
				IPnumbers.add(Integer.parseInt(ipSplitNumbers[i]));
			}
			long w = IPnumbers.get(0);
			long x = IPnumbers.get(1);
			long y = IPnumbers.get(2);
			long z = IPnumbers.get(3);
			
			long IPNumber = (w*16777216)+(x*65536)+(y*256)+(z);
			
			out.println("The IP Number for the IP Address "+s+" is "+IPNumber);
		}
		
	}

}

import java.util.*;
public class collections1 {
	public static void main(String[] args) {
		String[] things = {"eggs","lasers","hats","pie"};
		List<String> list  = new ArrayList<String>();
		
		// add array items to list
		for(String x: things)
			list.add(x);
		
		String[] morethings = {"lasers","hats"};
	
		
		for(String y: morethings)
			list.add(y);
		
		for(int i =0;i<list.size();i++) {
			System.out.printf("%s", list.get(i));
		}
			
	}

}

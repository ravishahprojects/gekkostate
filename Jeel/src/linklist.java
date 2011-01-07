import java.util.*;
public class linklist {
	public static void main (String[]args){
		
		String[] jeel = {"apples","noobs","pwnage","bacon","goATS"};
		List<String> list1 = new LinkedList<String>();
		for(String x : jeel)
			list1.add(x);
		
		String[] neel = {"sausage","bacon","goats","harrypotter"};
		List<String> list2 = new LinkedList<String>();
		for (String y : neel)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		
		printMe(list1);
				
	}
	//print me
	private static void printMe(List<String>l){
		for(String b : l)
			System.out.printf("%s",b);
		System.out.println();
	}
	
	
}

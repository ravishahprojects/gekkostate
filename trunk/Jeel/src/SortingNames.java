
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.io.*;
import static java.lang.System.out;


/**
 * @author Jeel Shah
 * 
 */
public class SortingNames {
	
	public static void main(String[] args) throws IOException{
		File file = new File("D:\\Java Projects\\Text Files\\Names.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		TreeSet<String>  Names = new TreeSet<String>();
		String line = null;
		while((line = br.readLine())!= null) {
			Names.add(line);
		}
		
		out.println(Names);
	} 

}

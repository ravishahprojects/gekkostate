/*
 *  This was used import java.io.*;
    import java.lang.*;
 * */
import java.util.*;

public class creatfileagain {

	
	public class createfileagain {
		
		private Formatter x;
		
		public void openFile() {
			try{
				x = new Formatter("indian.txt");
			}
			catch(Exception e){
				System.out.println("You gots an error =)");
				}
			}
				public void addRecords(){
					x.format("%s%s%s","20 ","bucky", "roberts" );
				}
		}
		public void closeFile(){
			
		}
	}
	
		



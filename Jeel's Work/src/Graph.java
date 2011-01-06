import java.io.*;

public class Graph {
	
	private static char x = 'x';
	
	public static void main(String[]args) {
		
		printGraph(12,x);
	}
	
	public static void printGraph(int num,char Char) {
		
		for(int i = 0;i<num;i++) {
			System.out.print(Char);
		}
	}
}

import java.util.Formatter;
@SuppressWarnings("unused")
public class createfile {

		public static void main(String[]args) {
			final Formatter x;
			
			try{
				x = new Formatter("JeelRocks.txt");
				System.out.println("You created a file");
			}
			catch(Exception e){
				System.out.println("You got an error");
			}
		}
	
}

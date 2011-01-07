
public class oldtime {
	public static void main(String args[]) {
		
		newtime newtimeObject = new newtime();
		newtime newtimeObject2 = new newtime(5);
		newtime newtimeObject3 = new newtime(5,13);
		newtime newtimeObject4 = new newtime(5,13,43);
		
		System.out.printf("%s\n", newtimeObject.toMilitary() );
		System.out.printf("%s\n", newtimeObject2.toMilitary() );
		System.out.printf("%s\n", newtimeObject3.toMilitary() );
		System.out.printf("%s\n", newtimeObject4.toMilitary() );
	}
}


public class TESTER1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(tester(2) != false) {
			System.out.println("IT IS NOT FALSE");
		}else {
			System.out.println("IT IS FALSE");
		}
		
	}
	public static boolean tester(int i) {
		if(i < 10) {
			return true;
		}
		return false;
	}

}

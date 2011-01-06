import java.io.*;

public class CheckTriangle {

        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        public static void main(String[] args) throws IOException {
                System.out.println("============================================================================");
                System.out.println("This program will check if the a triangle is Equilateral,Scalene or Obtuse");
                System.out.println("============================================================================");
                System.out.print("How many times would you like to run this program? ");
                int run = Integer.parseInt(br.readLine());
                
                for(int i = 1;i<=run;i++) {
                        System.out.println("We will begin with the first line.");
                        System.out.print("Please enter the x coordinate: ");
                        double x = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the y coordinate: ");
                        double y = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the x2 coordinate: ");
                        double x2 = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the y2 coordinate: ");
                        double y2 = Double.parseDouble(br.readLine());
                        System.out.println("Now please start entering the cordniates for the second line.");
                        System.out.print("Please enter the x value of the second line: ");
                        double p = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the y value of the second line: ");
                        double p2 = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the x2 value of the second line: ");
                        double p3 = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the y2 value of the second line: ");
                        double p4 = Double.parseDouble(br.readLine());
                        System.out.println("Now please start entering the cordniates for the third line: ");
                        System.out.print("Please enter the x value for the third line: ");
                        double i1 = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the y value of the third line: ");
                        double i2 = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the x2 value of the third line: ");
                        double i3 = Double.parseDouble(br.readLine());
                        System.out.print("Please enter the y2 value of the third line: ");
                        double i4 = Double.parseDouble(br.readLine());
                        cal(x,y,x2,y2,p,p2,p3,p4,i1,i2,i3,i4);
                }
        }
        
        public static double cal(double x,double y,double x2,double y2,double p,double p2,double p3,double p4,double i1,double i2,double i3,double i4) {
        	double distance = 0;
        	double distance1 = 0;
        	double distance2 = 0;
        	
        	// distance first line
    		double Tx = 0;
    		double Ty = 0;
    		Tx = Math.pow(x - x2, 2);
    		Ty = Math.pow(y - y2,2);
    		distance = Math.sqrt(Tx + Ty);
               
    		// distance second line
    		double Tx1 = 0;
    		double Ty1 = 0;
    		Tx1 = Math.pow(p-p3,2);
    		Ty1 = Math.pow(p2-p4, 2);
    		distance1 = Math.sqrt(Tx1+Ty1);
    		
    		// distance fourth line
    		double Tx2 = 0;
    		double Ty2 = 0;
    		Tx2 = Math.pow(i1-i3, 2);
    		Ty2 = Math.pow(i2-i4, 2);
    		distance2 = Math.sqrt(Tx2+Ty2);
    		
    		if(distance == distance1 && distance == distance2 && distance1 == distance2) {
    			System.out.println("The triangle is equilateral.");
    		}else if(distance == distance1 && distance == distance2) {
    			System.out.println("The triangle is scalene.");
    		}else {
    			System.out.println("The triangle is obtuse.");
    		}
                
                return p4;
        }
}

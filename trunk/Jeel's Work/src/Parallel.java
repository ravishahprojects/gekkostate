import java.io.*;

public class Parallel {
        
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        public static void main(String[]args) throws IOException{
        
                System.out.println("=====================================================================");
                System.out.println("This program will check if a line is parallel to another line");
                System.out.println("=====================================================================");
                System.out.print("How many times would you like to use this program?: ");
                int run = Integer.parseInt(br.readLine());
                
                for(int i = 1;i <= run;i++) {
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
                        cal(x,y,x2,y2,p,p2,p3,p4);
                }
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Thank you for using the program");
        }
        // method to calculate if a line is parallel or not
        public static double cal(double x,double y,double x2,double y2,double p,double p2,double p3,double p4) {
                
                double product = (x2-x)/(y2-y);
                double product1 = (p3-p)/(p4-p2);
                
                if(product == product1) {
                        System.out.println("The line is parallel.");
                }else {
                        System.out.println("The line is not parallel.");
                }
                
                return p4;
        }
}


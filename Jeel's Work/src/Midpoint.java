import java.io.*;
import java.text.*;

public class Midpoint {
                
                static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              
        public static void main(String[]args) throws IOException {
                System.out.println("=====================================================================");
                System.out.println("This program will check if a line is parallel to another line");
                System.out.println("=====================================================================");
                System.out.println("How many times would you like to use this program?: ");
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
                       
                        cal(x,y,x2,y2);
                }
        }
        public static double cal(double x,double y,double x2,double y2) {
                
                double product = (x+x2)/2;
                double product1 = (y+y2)/2;
               
                System.out.println("The cordinates are "+product+","+product1);
                
                return y2;
        }
}

import java.text.*;

public class CelsiusFarenheit {
        
        static DecimalFormat df = new DecimalFormat("###.#");
        
        public static void main(String[] args) {
                
                calculate();

        }
        
        public static void calculate() {
                
                
                
                System.out.print("Celsius           ");
                System.out.println("Fahrenheit");
                for(int i = 50;i <= 65; i++) {
                        
                        double answer = 1.8*i+32;
                        System.out.println(i+"                 "+df.format(answer));
                }
                
        }

}






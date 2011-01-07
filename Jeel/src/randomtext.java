import java.util.*;
import javax.swing.*;
/*
 * import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
 * */
public class randomtext extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 		
				
		
		       
		        Random randInt=new Random();
		        String specialCharacters="";
		        String digitCharacters="1234567890";
		        String lowerCaseCharacters="qwertyuiopasdfghjklzxcvbnm";
		        String upperCaseCharacters="QWERTYUIOPASDFGHJKLZXCVBNM";
		        StringBuffer password=new StringBuffer();
		        
		        for(int i=0;i<10;i++){
		            int charSet=randInt.nextInt(4);
		            switch(charSet){
		                case 0:
		                    password.append(digitCharacters.charAt(randInt.nextInt(digitCharacters.length()-1)));
		                    break;
		                case 2:
		                    password.append(lowerCaseCharacters.charAt(randInt.nextInt(lowerCaseCharacters.length()-1)));
		                    break;
		                case 3:
		                    password.append(upperCaseCharacters.charAt(randInt.nextInt(upperCaseCharacters.length()-1)));
		                    break;
		                case 4:
		                	password.append(specialCharacters.charAt(randInt.nextInt(specialCharacters.length()-1)));
		            }
		            
		        }
		        System.out.println(password.toString());
		       
		    }
	

}

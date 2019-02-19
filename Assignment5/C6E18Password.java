import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
public class C6E18Password {

private static  String errorMessage;

	public static void main(String[] args){
	

	int option=JOptionPane.YES_OPTION;
	while(option==JOptionPane.YES_OPTION){
		try{
			String password=JOptionPane.showInputDialog("Enter a Password: Must be 8 or more" +" letters or numerical digits 2" +" of which must be digits");
			isValidPassword(password);
			option=JOptionPane.showConfirmDialog(null,"Valid Password"+"\nDo you want to continue");
		} 
		catch(Exception ex){
			String outputStr = " Invalid Password: " +ex.getMessage() +"\nDo you want to continue? ";
			option = JOptionPane.showConfirmDialog(null, outputStr);
		} 
	} 
	
	} 


   private static  void isValidPassword(String str)throws Exception{
	   if(isNull(str))
		   throw new Exception(errorMessage);
	   if(!is_Only_Letter_Digit(str))
		   throw new Exception(errorMessage);
	   if(!isLeast_EightLetter(str)) 
		   throw new Exception(errorMessage);
	   if(!isLeast_Twodigit(str)) 
		   throw new Exception(errorMessage);
	   
   }
   
   public static  boolean isNull(String str) {
	   if(getlen(str)==0)
		   return true;
	   else {
		   errorMessage = "null";
		   return false;
	   }
   }
   
   /**Judge whether contain at least two digits*/
   public static  boolean isLeast_Twodigit(String str) {
	  
	   if(countDigit(str)>=2) {
		   return true;
	   }
	   else {
		   errorMessage = "Must contain at least two digits.";
		   return false;
	   }
   }
   public static  int countDigit(String str) {
	   Matcher match = Pattern.compile("\\d").matcher(str);
       int count = 0;
       while (match.find())
           count++;
       return count;
	   
   }
   
   /**Judge whether contain at least eight characters*/
   public static boolean isLeast_EightLetter(String str) {
	   if(getlen(str)>=8) {
		   return true;
	   }
	   else {
		   errorMessage = " Must have at least eight characters.";
		   return false;
	   }
   }

   
   /**Judge whether contain only letters and digits.*/
   public static boolean is_Only_Letter_Digit(String str) {
	  
   
	   if(str.matches("^[A-Za-z0-9]+$"))
		   return true;
	   else {
		   errorMessage = " Must contain only letters and digits.";
		   return false;
	   }
	   
	   
   }
   
   public static int getlen(String str) {
       return str.length();
   } 
  
   
} // end class Password

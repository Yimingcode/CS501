import java.util.*;

public class C6E23Occurance {

	public static void main(String[] args) {
		
        
		boolean isString;
		int repeatInt1 = 1;
		
		do {
		Scanner input1 = new Scanner(System.in); 
		System.out.print("Enter a string: ");
	    String string1 = input1.nextLine();
			
		System.out.print("Enter a character you want to count: ");
        int i = 0;
       
        Scanner input2 =new Scanner(System.in);
		char ch = input2.next().charAt(i);
		
		System.out.println(
  				"The number of occurrences of \"" + ch  + "\" in \'" + string1 + "\" is: " +
  				count(string1, ch));

		System.out.print("Repeat program (enter 1 for yes or 0 for no)?: ");
		Scanner input = new Scanner(System.in);
  		repeatInt1 = input.nextInt();
		
		
        }while(repeatInt1 == 1);
		
		

		System.out.println("Thanks for using.");
}
		
			

	public static int count(String str, char ch) {
		int count = 0; 

		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i))
				count++;
		}
		return count;
	}
	
	
}
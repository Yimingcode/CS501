import java.util.InputMismatchException;
import java.util.Scanner;

public class C11E1_C12E5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// Prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		boolean repeatSidesInput = true;
		
		int repeatInt = 1;
		while(repeatInt == 1) {
		do {
			// Prompt the user to enter three sides of the triangle
			System.out.print("Enter three side of the triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();
	
			try {
				// Create triangle object with user input
				Triangle triangle = new Triangle(side1, side2, side3);
				repeatSidesInput = false;	
				
				triangle.setColor(color);
				triangle.setFilled(filled);
		
				System.out.println(triangle.toString());
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
				System.out.println("Color: " + triangle.getColor());
				System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
					+ "filled");
			}
			catch (IllegalTriangleException ex) {
				
				System.out.println("The sum of any two sides must be greater than the third");
			}
			
		} while (repeatSidesInput);
		
		try {
        	Scanner input2 = new Scanner(System.in);
        	System.out.print("Repeat program(type 1 for yes or other integers for no)?: ");
    		repeatInt = input.nextInt();
        	
        	}
            catch(InputMismatchException e){
               System.out.print("Input integers please.\n" + "Repeat program(type 1 for yes or other integers for no)?: ");
         	   Scanner input3 = new Scanner(System.in);
         	   repeatInt = input3.nextInt();
            }
		
	}
		System.out.println("Thanks for using");
	}
}
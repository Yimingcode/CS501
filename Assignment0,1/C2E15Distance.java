import java.util.Scanner;
public class C2E15Distance {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first point : " );
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	System.out.print("Enter the second point : ");
	
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double a;
	double b;

	
	a = x1 - x2;
	b = y1 - y2;
	double distance = Math.pow(a * a + b * b, 0.5);
	System.out.println("Distance between two points are : " + distance);
	
	
}
}
import java.util.Scanner;
public class C4E2Circle {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
	double a1 = input.nextDouble();
	double b1 = input.nextDouble();
	double x1 = Math.toRadians(a1);
	double y1 = Math.toRadians(b1);
	System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
	double a2 = input.nextDouble();
	double b2 = input.nextDouble();
	double x2 = Math.toRadians(a2);
	double y2 = Math.toRadians(b2);
	char radius = (char) 6371.01;
	double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
	System.out.println("The distance between two points is: " + d);
}
}

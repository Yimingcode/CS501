import java.util.Scanner;
public class C2E19Area {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first point : " );
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	System.out.print("Enter the second point : ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	System.out.print("Enter the third point : ");
	double x3 = input.nextDouble();
	double y3 = input.nextDouble();
	
	double a = Math.pow( (x1 - x2) * (x1 - x2) + (y1 -y2) * (y1 - y2) , 0.5);
	double b = Math.pow( (x2 - x3) * (x2 - x3) + (y2 -y3) * (y2 - y3) , 0.5);
	double c = Math.pow( (x1 - x3) * (x1 - x3) + (y1 -y3) * (y1 - y3) , 0.5);
	
	double s;
	s = (a + b + c) / 2;
	double A = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
	
	System.out.println("The area of the triangle is : " + A);
}
}

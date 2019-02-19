import java.util.Scanner;
public class C4E3Estimate {
	private static final double radius = 6371.01;
public static void main(String[] args) {
	double atlantaX = 33.7489;
	double atlantaY = -84.3879;           // Atlanta, Georgia;
	double orlandoX = 28.5383;          
	double orlandoY = -81.3792;           //Orlando, Florida;
	double savannahX = 32.0835;
	double savannahY = -81.0998;            //Savannah, Georgia;
	double charlotteX = 35.2270;
	double charlotteY = -80.8431;            //Charlotte, North Carolina;
	double x1 = Math.toRadians(atlantaX);
	double y1 = Math.toRadians(atlantaY);
	double x2 = Math.toRadians(orlandoX);
	double y2 = Math.toRadians(orlandoY);
	double x3 = Math.toRadians(savannahX);
	double y3 = Math.toRadians(savannahY);
	double x4 = Math.toRadians(charlotteX);
	double y4 = Math.toRadians(charlotteY);
	

	double d1 = radius * Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));    
	double d2 = radius * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));   
	double d3 = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));    
	double d4 = radius * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));    
	double d5 = radius * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));    
	System.out.println("The latitude of atlanta is: " + atlantaX);
	System.out.println("The longitude of atlanta is: " + atlantaY);
	System.out.println("The latitude of orlando is: " + orlandoX);
	System.out.println("The longitude of orlando is: " + orlandoY);
	System.out.println("The latitude of savannah is: " + savannahX);
	System.out.println("The longitude of savannah is: " + savannahY);
	System.out.println("The latitude of charlotte is: " + charlotteX);
	System.out.println("The longitude of charlotte is: " + charlotteY);
	System.out.println("The distance between Atlanta and charlotte is:" + d1 +"km");
	
	System.out.println("The distance between Atlanta and Savannah is:" + d2 + "km");
	
	System.out.println("The distance between Atlanta and orlando is:" + d3 +"km");
	
	System.out.println("The distance between Savannah and Charlotte is:" + d4 + "km");
	
	System.out.println("The distance between Orlando and Savannash is:" + d5 + "km");
	double s1 = (d1 + d2 + d4) / 2.0;
	double A1 = Math.pow(s1 * (s1 - d1) * (s1 - d2) * (s1 - d4), 0.5);
	double s2 = (d2 + d3 + d5) / 2.0;
	double A2 = Math.pow(s2 * (s2 - d2) * (s2 - d3) * (s2 - d5), 0.5);
	double area = A1 + A2;
	System.out.println("The area of the first triangle is: " + A1 + "km2 " + "The area of the second triangle is: " + A2 + "km2");
	System.out.println("The area is: " + area + "km2");
}
}

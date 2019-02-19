
public class Triangle extends GeometricObject{
       private double side1;
       private double side2;
       private double side3;
       
       Triangle(){
    	   side1 = side2 = side3 = 1.0;
    	   
       }
       
       public Triangle(double s1, double s2, double s3) 
               throws IllegalTriangleException {
           if (s1 + s2 <= s3 || s2 + s3 <= s1 || s1 + s3 <= s2) {
               throw new IllegalTriangleException("The sum of any two sides must be greater than the third");
   }
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
}
       
       public double getSide1() {
    	      return side1;
       }
       
       public double getSide2() {
    	      return side2;
       }
       
       public double getSide3() {
    	      return side3;
       }
       
       public double getArea() {
    	   double s =(side1 + side2 + side3) / 2;
    	   return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
       }
       
       public double getPerimeter() {
    	    return side1 + side2 + side3;
       }
       
       public String toString() {
    	    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
       }
}

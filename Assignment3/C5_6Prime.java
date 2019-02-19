import java.util.Arrays;
import java.util.Scanner;
public class C5_6Prime {
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are: \n");
		printPrimeNumbers(50);
		int numberOfprimes = 0;
		for (int i = 2; i < 1000; i++) {
			if (isPrime(i))
				numberOfprimes++; 
		}
		
		System.out.println("\n\nThe number of prime numbers less than 1000: " + numberOfprimes);
		
		
		Scanner input = new Scanner(System.in);
    	System.out.println("\nEnter 10 numbers: ");
    	double[] myList = new double[10];
       
       for (int i = 0; i < 10; i++)
    	myList[i] = input.nextDouble();
       System.out.println("The array is: " + Arrays.toString(myList) );
      
       System.out.println("Enter a number: ");
       double number = input.nextDouble();
       double j = ArraySearch(myList, number);
       System.out.println("The index is: " + j);
      
       double index = 2;
         if (number <= 0) {
   		 System.out.println("Please enter a positive integer");}
        	else if (number == 1) {
   		 System.out.println("1");
   	}
    	 else {
    	 while (number / index != 1) {
   		 if(number % index == 0) {
   			System.out.print(index + ", ");
   			number /= index;
   		}
   		 else index++;
   		
   	}
    	 System.out.println(number );}
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; 
		int count = 0; 
		int number = 2; 

		while (count < numberOfPrimes) {

			if (isPrime(number)) {
				count++; 
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.printf("%-4s\n", number);
				}
				else
					System.out.printf("%-4s", number);
			}
	
			number++;
		}
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number/2; divisor++) {
			if (number % divisor == 0) { 
				return false; 
			}
		}

		return true;
	
	}
	 
	    public static double ArraySearch(double[] list, double key) {
 	    for (int i = 0; i < list.length; i++) {
 	    if (key == list[i])
 	    return i;
 	    }
 	   return -1; //not found
      } 
}

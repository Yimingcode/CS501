import java.util.Scanner;

public class C7Arrays {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double[] numbers = new double[10];

	System.out.print("Enter ten numbers: ");
	for (int i = 0; i < numbers.length; i++)
		numbers[i] = input.nextDouble();

	selectionSort(numbers);

	for (double e: numbers) 
		System.out.print(e + " ");
	System.out.println();
	
	System.out.println("The minimum number is " + 
			numbers[indexOfSmallestElement(numbers)] + " index " +
			indexOfSmallestElement(numbers));
}
	public static int indexOfSmallestElement(double[] array) {
		if (array.length <= 1)
			return 0;
		
		double min = array[0];
		int minIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	public static void selectionSort(double[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}	

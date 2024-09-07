import java.util.Scanner;

public class FloatingPointValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		// Variables to store the values
		double[] values = new double[5];
		double total = 0;
		double max = Double.NEGATIVE_INFINITY;
		double min = Double.POSITIVE_INFINITY;
		
		int count = 0;
		
		System.out.println("Please enter 5 floating-point values:");
		
		// Reading five floating-point values
		while (count < 5) {
			System.out.print("Enter value " + (count + 1) + ": ");
			if (scnr.hasNextDouble()) {
				values[count] = scnr.nextDouble();
				total += values[count];
				
				if (values[count] > max) {
					max = values[count];
				}
				if (values[count] < min) {
					min = values[count];
				}
				
				count++;
			} else {
				System.out.println("Invalid input. Please enter a valid floating-point number.");
				scnr.next(); // Clear the invalid input
			}
		}
		// Calculate average
		double average = total / values.length;
		
		// Calculate interest on total at 20%
		double interest = total * 0.20;
		
		// Print the results
		System.out.println("\nTotal: " + total);
		System.out.println("Average: " + average);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Interest on total at 20%: " + interest);
		
		scnr.close();
	}

}

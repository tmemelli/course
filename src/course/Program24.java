package course;

import java.util.Locale;
import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three student scores:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double sum = n1 + n2 + n3;
		
		System.out.printf("Final Score = %.2f%n", sum);
		if (sum < 60) {
			System.out.println("FAILED");
		}		
		
		sc.close();
	}

}

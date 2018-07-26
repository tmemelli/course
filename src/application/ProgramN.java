package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramN {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n1 = sc.nextInt();
		double[] vect = new double[n1];
		
		for (int i = 0; i < n1; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n1; i++) {
			sum += vect[i];
		}

		double avg = sum/n1;
		System.out.printf("AVERAGE HEIGHT = %.2f%n", avg);
		
		sc.close();		
	}
}

package course;

import java.util.Locale;
import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Student #" + i + ": ");
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			double sum = nota1 + nota2 + nota3;

			System.out.printf("Final score: %.2f%n", sum);
		}
		
		sc.close();
	}

}

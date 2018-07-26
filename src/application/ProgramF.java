package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramF {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double rad = sc.nextDouble();

		double c = circumferente(rad);
		double v = volume(rad);

		System.out.printf("Circumferente: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);

		sc.close();
	}

	public static double circumferente(double rad) {
		return 2.0 * PI * rad;
	}

	public static double volume(double rad) {
		return 4.0 * PI * rad * rad * rad / 3.0;
	}
}
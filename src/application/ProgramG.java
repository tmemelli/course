package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramG {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double rad = sc.nextDouble();

		double c = Calculator.circumferente(rad);
		double v = Calculator.volume(rad);

		System.out.printf("Circumferente: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}
}
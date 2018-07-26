package course;

import java.util.Locale;
import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter glucose measure: ");
		double gluco = sc.nextDouble();

		if (gluco <= 140 && gluco > 100) {
			System.out.println("High");
		} else if (gluco <= 100) {
			System.out.println("Normal");
		} else {
			System.out.println("Diabetes");
		}
		
		sc.close();
	}
}

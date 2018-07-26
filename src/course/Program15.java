package course;

import java.util.Locale;
import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrada:");
		String[] vect = sc.nextLine().split(" ");
		int a = Integer.parseInt(vect[0]);
		int b = Integer.parseInt(vect[1]);
		int c = Integer.parseInt(vect[2]);

		if (a > b && a > c) {
			System.out.println("Higher: " + a);
		}
		else if ( b > c) {
			System.out.println("Higher: " + b);
		}
		else {
			System.out.println("Higher: " + c);
		}
		
		
		sc.close();

	}

}

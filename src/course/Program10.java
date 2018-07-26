package course;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String perg1 = "Enter your full name:";
		String perg2 = "How many bedrooms are there in your house?";
		String perg3 = "Enter product price:";
		String perg4 = "Enter your last name, age and height (same line):";
		System.out.println(perg1);
		String name = sc.nextLine();
		System.out.println(perg2);
		int n1 = sc.nextInt();
		System.out.println(perg3);
		double n2 = sc.nextDouble();
		System.out.println(perg4);
		sc.nextLine();
		String[] vect = sc.nextLine().split(" ");
		String lastName = vect[0];
		int age = Integer.parseInt(vect[1]);
		double digit = Double.parseDouble(vect[2]);
		
		System.out.println(name);
		System.out.println(n1);
		System.out.printf("%.2f%n", n2);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f%n", digit);
		
		sc.close();
	}

}

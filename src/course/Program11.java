package course;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullName = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		sc.nextLine();
		String[] vect = sc.nextLine().split(" ");
		String lastName = vect[0];
		int age = Integer.parseInt(vect[1]);
		double height = Double.parseDouble(vect[2]);
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f%n", height);
		sc.close();
	}
}
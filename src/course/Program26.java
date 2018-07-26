package course;

import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two integer numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int menor = x;
		int maior = y;
		int total = 0;

		if (y < x) {
			menor = y;
			maior = x;
		}

		for (int i = menor; i <= maior; i++) {
			if (i % 2 != 0) {
				total += i;
			}
		}

		System.out.println("Sum of odd numbers = " + total);

		sc.close();
	}

}

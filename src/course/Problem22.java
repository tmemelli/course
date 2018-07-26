package course;

import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int aux = Integer.MIN_VALUE;

		while (n <= 0) {
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i + ": ");
			int x = sc.nextInt();
			if (x > aux) {
				aux = x;
			}
		}

		System.out.println("Higher = " + aux);

		sc.close();
	}

}

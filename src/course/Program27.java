package course;

import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer value: ");
		int n1 = sc.nextInt();
		
		while (n1 != 0) {
			int quadrado = n1 * n1;
			System.out.println(quadrado);
			System.out.print("Enter an integer value: ");
			n1 = sc.nextInt();
		}
		
		sc.close();
	}
}

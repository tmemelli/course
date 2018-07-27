package application;

import java.util.Scanner;

import entities.Pensao;

public class ProgramP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int totrooms = sc.nextInt();
		Pensao[] vect = new Pensao[10];
		
		for (int i = 1; i <= totrooms; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Pensao(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}			
		}
		
		sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class ProgramM {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrente contacorrente;

		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char temdepos = sc.next().charAt(0);

		if (temdepos == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoinicial = sc.nextDouble();
			contacorrente = new ContaCorrente(conta, nome, depositoinicial);
		} else {
			contacorrente = new ContaCorrente(conta, nome);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(contacorrente);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valordep = sc.nextDouble();
		contacorrente.deposito(valordep);
		System.out.println("Updated account data: ");
		System.out.println(contacorrente);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorsac = sc.nextDouble();
		contacorrente.saque(valorsac);
		System.out.println("Updated account data: ");
		System.out.println(contacorrente);
		
		sc.close();
	}

}

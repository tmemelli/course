package application;

import entities.Account;
import entities.BusinessAccount;
import entities.ContaPoupanca;

public class Program_Heranca {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "James", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Thiago", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Maria", 0.0, 200.0);
		Account acc3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.updateBalance();
			System.out.println("------------------");
			System.out.println("Update!");
			System.out.println(acc5.getHolder());
			System.out.println(acc5.getNumber());
			System.out.println(acc5.getBalance());
		}
		System.out.println("------------------");
		System.out.println(acc.getHolder());
		System.out.println(acc.getNumber());
		System.out.println(acc.getBalance());
		
		System.out.println("------------------");
		System.out.println(acc1.getHolder());
		System.out.println(acc1.getNumber());
		System.out.println(acc1.getBalance());

		System.out.println("------------------");
		
		
		Account acc6 = new Account(1001, "Chimbinha", 1000.0);
		acc6.saque(200.0);
		System.out.println(acc6.getBalance());
		
		// Sobreposicao		
		Account acc7 = new ContaPoupanca(1002, "Tanajura", 1000.0, 0.01);
		acc7.saque(200.0);
		System.out.println(acc7.getBalance());
	}
}
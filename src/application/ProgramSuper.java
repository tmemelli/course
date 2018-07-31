package application;

import entities.Account;
import entities.BusinessAccount;
import entities.ContaPoupanca;

public class ProgramSuper {

	public static void main(String[] args) {
		
		BusinessAccount bacc = new BusinessAccount(1001, "James", 1000.0, 500.0);
		bacc.saque(200.0);
		System.out.println(bacc.getBalance());
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);
		
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}
}
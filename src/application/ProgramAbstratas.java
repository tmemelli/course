package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.ContaPoupanca;

public class ProgramAbstratas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		//Na class Account -> public abstract class Account {
//		Account acc1 = new Account(1001, "Maria", 1000.0);
//		Account acc2 = new ContaPoupanca(1002, "Thiago", 1000.0, 0.01);
//		Account acc3 = new BusinessAccount(1003, "Joao", 1000.0, 500.0);
		
		list.add(new ContaPoupanca(1004, "Thiago", 500.0, 0.01));
		list.add(new BusinessAccount(1005, "Joao", 1000.0, 400.0));
		list.add(new ContaPoupanca(1006, "Andre", 300.0, 0.01));
		list.add(new BusinessAccount(1007, "Maria", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposito(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}		
	}
}

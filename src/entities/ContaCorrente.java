package entities;

public class ContaCorrente {
	
	private int conta; 
	private String nome;
	private double saldo;

	public ContaCorrente(int conta, String nome, double depositoinicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoinicial);
	}

	public ContaCorrente(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
		
	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double amount) {
		saldo += amount;
	}

	public void saque(double amount) {
		saldo -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ conta 
				+ ", Holder: " 
				+ nome 
				+ ", Balance: $ " 
				+ String.format("%.2f", saldo);
	}
	
}

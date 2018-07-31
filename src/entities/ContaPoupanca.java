package entities;

public class ContaPoupanca extends Account {
	
	private Double interestRate;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// Sobreposicao
	@Override
	public final void saque(double amount) {
		balance -= amount;
	}
	
}

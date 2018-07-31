package entities;

public class PessoaFisica extends Contribuintes {

	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double tax() {
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - gastoSaude * 0.5;
		} else {
			return getRendaAnual() * 0.25 - gastoSaude * 0.5;
		}
	}

}

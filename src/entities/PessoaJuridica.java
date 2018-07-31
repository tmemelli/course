package entities;

public class PessoaJuridica extends Contribuintes {

	private Integer numFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public Double tax() {
		if (numFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}

}

package entities;

public class Aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double calculoFinalGrade() {
		return nota1 + nota2 + nota3;
	}

	public double calculoDiferenca(double notafinal) {
		return 60 - notafinal;
	}
	
	public void verificarAprovacao(double notafinal) {
		if (notafinal < 60) {
			System.out.println("FAILED");
		} else {
			System.out.println("PASS");
		}
	}

	public String toString() {
		return String.format("%.2f", calculoDiferenca(calculoFinalGrade())) + " POINTS";
	}

}

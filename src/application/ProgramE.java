package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramE {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
	
		System.out.printf("FINAL GRADE = %.2f%n", aluno.calculoFinalGrade());
		aluno.verificarAprovacao(aluno.calculoFinalGrade());
		
		if (aluno.calculoDiferenca(aluno.calculoFinalGrade()) > 0) {
			System.out.println("MISSING " + aluno.toString());
		}

		sc.close();
	}

}

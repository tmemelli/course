package course;

/* Apenas para testar como funciona os comentarios
 * em Java 
 */

import java.util.Locale;
import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Desconto %.3f%n", desconto);

		sc.close();
		
	}

}

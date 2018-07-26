package course;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Program20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String firstNumber;
		double number1;

		firstNumber = JOptionPane.showInputDialog("Enter a number:");
		number1 = Double.parseDouble(firstNumber);

		while (number1 >= 0) {
			double sr = Math.sqrt(number1);
			JOptionPane.showMessageDialog(null, "A raiz quadrada é: " + sr, "Results", JOptionPane.PLAIN_MESSAGE);
			
			firstNumber = JOptionPane.showInputDialog("Enter another number:");
			
			number1 = Double.parseDouble(firstNumber);
		}
		JOptionPane.showMessageDialog(null, "Negative number", "Results", JOptionPane.PLAIN_MESSAGE);

		System.exit(0);
	}

}
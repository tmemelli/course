package course;

import javax.swing.JOptionPane;

public class Program7 {

	public static void main(String[] args) {
		
		String firstnumber;
		firstnumber = JOptionPane.showInputDialog("Entre com o primeiro número");
		
		int mask = 0b100000;
		int n;
		
		n = Integer.parseInt(firstnumber);
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
	}

}

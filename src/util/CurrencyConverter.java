package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double imposto(double price, double totdollar) {
		return price * totdollar * IOF ;
	}

	public static double totalComImposto(double totdollar, double price, double imposto) {
		return totdollar * price + imposto;
	}
}

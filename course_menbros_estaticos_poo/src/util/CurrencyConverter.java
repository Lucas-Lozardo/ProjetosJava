package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double converter(double dollarPrice, double quantity) {
		return dollarPrice * quantity * (1.0 + IOF);
	}

}

package JOOPUdemy;

public class CalculatorMan {

	public double a;
	public double b;
	
	
	public double CurrencyConverter() {
		double ans = a*b;
		double iof = ((6.0/100) * a) * b;
		return ans+iof;
	}
	public String toString() {
		return String.format("Amount to be paid in reais = %.2f", CurrencyConverter());
	}
	
}

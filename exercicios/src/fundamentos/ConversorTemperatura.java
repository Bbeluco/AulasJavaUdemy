package fundamentos;

public class ConversorTemperatura {
	public static void main(String[] args) {
		double fahrenheit = 86;
		final int DIFERENCA = 32;
		final double FATOR = 5/9.0;
		
		double celsius = (fahrenheit - DIFERENCA) * FATOR;
		
		System.out.println("O resultado é: " + celsius+"ºC");
	}
}

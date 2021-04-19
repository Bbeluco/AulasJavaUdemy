package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celsius");
		double celsius = entrada.nextDouble();
		
		entrada.close();
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.printf("A temperatura %.2f Cº em fahrenheit é: %.2f", 
				celsius, fahrenheit);
		
	}
}

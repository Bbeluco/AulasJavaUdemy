package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fº: ");
		double fah = entrada.nextDouble();
	
		entrada.close();
		
		double celsius = (fah - 32) / 1.8;
		System.out.printf("A temperatura %.2f Fº em Celsius é: %.2f",
				fah, celsius);
	}
}

package desafios;

import java.util.Scanner;

public class NumeroPositivos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		while(numero >= 0) {
			System.out.print("Digite um numero: ");
			soma += numero;
			numero = entrada.nextInt(); 
		}
		System.out.println("A soma total " + soma);
		System.out.println("FIM DO PROGRAMA");
		entrada.close();
	}
}

package desafios;

import java.util.Scanner;

public class MaiorMenor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int maior = 0;
		int menor = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %d número: ", i);
			numero = entrada.nextInt();
			if(i == 0) {
				maior = numero;
				menor = numero;
			} else if(numero > maior) {
				maior = numero;
			} else if(numero < menor) {
				menor = numero;
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		entrada.close();
	}
}

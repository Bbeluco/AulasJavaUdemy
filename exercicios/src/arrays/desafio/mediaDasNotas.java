package arrays.desafio;

import java.util.Scanner;

public class mediaDasNotas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas deseja computar? ");
		int tamanhoArray = entrada.nextInt();
		
		double[] notas = new double[tamanhoArray];
		
		for(int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Digite a %d nota: ", i+1);
			notas[i] = entrada.nextDouble();
		}
		entrada.close();
		
		double soma = 0;
		for(double nota: notas) {
			soma += nota;
		}
		
		System.out.printf("A média das %d notas foi: %.2f", 
				tamanhoArray, soma/tamanhoArray);
	}
}

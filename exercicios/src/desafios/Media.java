package desafios;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a 1º nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a 2º nota: ");
		double nota2 = entrada.nextDouble();
		entrada.close();
		
		double media = (nota1+nota2) / 2;
		if(media >= 7) {
			System.out.println("Aprovado");
		} else if(media > 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}
}

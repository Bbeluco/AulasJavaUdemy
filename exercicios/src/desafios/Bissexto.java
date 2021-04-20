package desafios;

import java.util.Scanner;

public class Bissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		int ano = entrada.nextInt();
		entrada.close();
		
		if(ano % 4 == 0 ) {
			System.out.println("Ano BISSEXTO");
		} else {
			System.out.println("Ano comum");
		}
	}
}

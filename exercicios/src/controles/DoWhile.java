package controles;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Você quer sair? ");
			valor = entrada.nextLine();
		}while(!valor.equalsIgnoreCase("por favor"));
		entrada.close();
		
		System.out.println("Obrigado e até a próxima");
	}
}

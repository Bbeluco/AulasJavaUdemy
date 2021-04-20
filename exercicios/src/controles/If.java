package controles;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a média: ");
		double media = entrada.nextDouble();
		entrada.close();
		
		if(media >= 0 && media <= 4.5) {
			System.out.println("REPROVADO!");
		}
		
		if(media > 4.5 && media < 7) {
			System.out.println("Está de recuperação");
		}
		
		if(media >= 7 && media <= 10) {
			System.out.println("APROVADO :)");
			System.out.println("Parabéns");
		}
	}
}

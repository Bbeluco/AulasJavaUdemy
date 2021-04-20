package controles;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a media: ");
		double media = entrada.nextDouble();
		entrada.close();
		
		if(media < 0 || media > 10) {
			System.out.println("Nota invalida");
		} else if(media >= 8.1) {
			System.out.println("A");
			System.out.println("PARABENS");
		} else if(media >= 6.1) {
			System.out.println("B");
		} else if(media >= 4.1) {
			System.out.println("C");
		} else if(media >= 2.1) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		
		System.out.println("FIM!!");
	}
}

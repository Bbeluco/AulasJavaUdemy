package desafios;

import java.util.Scanner;

public class NumeroPrimoSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int numero = entrada.nextInt();
		int primo = 0;
		entrada.close();
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				primo = 1;
				break;
			}
		}
		
		switch(primo) {
		case 0:
			System.out.println("PRIMO");
			break;
		case 1:
			System.out.println("Não primo");
			break;
		}
	}
}

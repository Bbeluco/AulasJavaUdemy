package desafios;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int numero = entrada.nextInt();
		boolean primo = true;
		entrada.close();
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				primo = false;
			}
		}
		
		System.out.println("É primo? " + primo);
	}
}

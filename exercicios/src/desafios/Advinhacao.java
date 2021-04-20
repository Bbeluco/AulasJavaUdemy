package desafios;

import java.util.Scanner;

public class Advinhacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int al = (1 + (int)(Math.random() * 10));
		int tentativa = 0;
		boolean sucesso = false;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Escolha um número: ");
			tentativa= entrada.nextInt();
			if(tentativa == al) {
				sucesso = true;
				break;
			}
		}
		System.out.println("Escolha do computador: " + al);
		System.out.println("Achou o resultado? " + sucesso);
		
		entrada.close();
	}
}

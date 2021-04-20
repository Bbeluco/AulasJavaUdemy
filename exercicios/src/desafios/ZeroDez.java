package desafios;

import java.util.Scanner;

public class ZeroDez {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escolha um numero: ");
		int numero = entrada.nextInt();
		boolean par = false;
		boolean zeroEDez = numero >= 0 && numero <= 10;
		entrada.close();
		if(numero % 2 == 0) {
			par = true;
		}
		
		
		
		System.out.println("Entre 0 e 10? " + zeroEDez);
		System.out.println("Par? " + par);
		
	}
}

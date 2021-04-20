package desafios;

import java.util.Scanner;

public class LetraALetra {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra = entrada.next();
		entrada.close();
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}
}

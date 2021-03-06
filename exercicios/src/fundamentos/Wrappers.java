package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		/*
		 * Nesta classe abordaremos Wrappers
		 * Na tradução Wrapper significa embrulho
		 * ele serve para deixarmos os tipos primitivos com funcionalidades extras
		 * Ex: conversão de tipos
		 */
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		System.out.print("Digite um valor inteiro: ");
		Integer i = Integer.parseInt(entrada.next()); //int 
		Long l = 100000L;		
		Float f = 15.75F;
		Double d = 45728.5;
		Boolean bo = true;
		Character c = '#'; //char
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bo);
		System.out.println(c);
		
		entrada.close();
	}
}

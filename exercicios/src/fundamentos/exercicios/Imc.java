package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Digite sua altura: ");
		double al = entrada.nextDouble();
		entrada.close();
		
		double imc = peso / Math.pow(al, 2);
		System.out.println("Seu IMC é: "+ imc);
	}
}

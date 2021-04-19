package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		double v = entrada.nextDouble();
		entrada.close();
		
		System.out.println("Quadrado: " + Math.pow(v, 2));
		System.out.println("Cubo: " + Math.pow(v, 3));
	}
}

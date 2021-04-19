package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor da base: ");
		double base = entrada.nextDouble();
		System.out.print("Digite o valor da altura: ");
		double altura = entrada.nextDouble();
		entrada.close();
		
		double area = (base * altura) / 2;
		System.out.println("Área: " + area);
	}
}

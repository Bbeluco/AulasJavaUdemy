package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioCapitulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1º numero: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o 2º numero: ");
		double n2 = entrada.nextDouble();
		System.err.print("Escolha uma operacao: ");
		String operador = entrada.next();
		entrada.close();
		
		double soma = n1 + n2;
		double subtracao = n1 - n2;
		double multiplicacao = n1 * n2;
		double divisao = n1 / n2;
		double modulo = n1 % n2;
		
		double resultado = operador.equals("+") ? soma 
				: operador.equals("-") ? subtracao
				: operador.equals("*") ? multiplicacao 
				: operador.equals("/") ? divisao : modulo;
		System.out.println(resultado);
	}
}

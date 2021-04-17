package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("\nDigite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("\nDigite sua idade: ");
		int idade = entrada.nextInt();
		System.out.print("\nDigite seu peso: ");
		float peso = entrada.nextFloat();
		
		System.out.printf("\n\nO nome do usuário é %s %s e sua idade é %d anos e pesa: %.2fkg",
				nome, sobrenome, idade, peso);
		
		entrada.close();
		
	}
}

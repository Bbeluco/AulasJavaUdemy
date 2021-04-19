package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		System.out.print("Digite o seu 1º salário: ");
		String n1Str = entrada.nextLine().replace(",", ".");; 
		System.out.print("Digite o seu 2º salário: ");
		String n2Str = entrada.nextLine().replace(",", ".");;
		System.out.print("Digite o seu 3º salário: ");
		String n3Str = entrada.nextLine().replace(",", ".");;
		
		entrada.close();
		
		//Conversão de String para float
		float n1 = Float.parseFloat(n1Str);
		float n2 = Float.parseFloat(n2Str);
		float n3 = Float.parseFloat(n3Str);
		
		
		float mediaSalario = (n1 + n2 + n3) / 3;
		
		System.out.printf("A média salárial deste funcionário é de R$%.2f", 
				mediaSalario);
	}
}

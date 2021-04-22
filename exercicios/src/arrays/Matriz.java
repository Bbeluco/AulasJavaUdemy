package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos: ");
		int qtdAlunos = entrada.nextInt();
		System.out.print("Digite a quantidade de notas: ");
		int qtdNotas = entrada.nextInt();
		
		double[][] turma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		
		for (int a = 0; a < turma.length; a++) {
			for (int n = 0; n < turma.length; n++) {
				System.out.printf("Informe a %d nota do %d º aluno: "
						,n+1, a+1);
				turma[a][n] = entrada.nextDouble();
				total += turma[a][n];
			}
		}
		
		entrada.close();
		
		System.out.println("A média geral da turma foi: " + 
				total / (qtdAlunos * qtdNotas));
	}
}

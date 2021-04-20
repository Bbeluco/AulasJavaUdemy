package desafios;

import java.util.Scanner;

public class MediaDaTurma {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		int notasComputadas = 0;
		double nota = 0;
		while(nota != -1) {
			System.out.printf("Digite a nota do %dº aluno: "
					, notasComputadas);
			nota = entrada.nextDouble();
			if(nota < 0 || nota > 10) {
				System.out.println("Valor invalido");
			}else if(nota == -1) {
				System.out.println("Saindo do programa...");
			} else {
				total += nota;
				notasComputadas++;
				System.out.println("TOTAL: " + total);
				System.out.println("notasComputadas: " + notasComputadas);
			}
			
		}
		entrada.close();
		
		System.out.println("Media da turma " + (total / notasComputadas));
		System.out.println("FIM!");
	}
}

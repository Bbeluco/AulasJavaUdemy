package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 7.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 7.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		Aluno a7 = new Aluno("Ana", 7.8);
		Aluno a8 = new Aluno("Bia", 5.8);
		Aluno a9 = new Aluno("Daniel", 9.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);
		
		//Mostra apenas itens 1 vez na lista semelhante ao sort -u no linux
		System.out.println("Distinct.....");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2) //Pula os 2 primeiros itens da lista
			.limit(2) //Limita para apenas 2 elementos da lista
			.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7) //Enquanto essa lambda for verdadeira continua o laço, para no mesmo momento que for falso
			.forEach(System.out::println);
	}
}

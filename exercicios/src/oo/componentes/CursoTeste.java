package oo.componentes;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Bruno");
		
		Curso curso1 = new Curso("Java");
		
		curso1.adicionarAluno(aluno1);
		
		for(Aluno c: curso1.alunos) {
			System.out.println(c.nome);
		}
	}
}

package oo.encapsulamento;

public class PessoasTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Bruno", "Beluco", 30);
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Sobrenome: " + p1.getSobrenome());
		System.out.println(p1.toString());
	}
}

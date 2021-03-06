package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome,int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public void setIdade(int idadeAtual) {
		if(idadeAtual >= 0 && idadeAtual <= 120) {
			idade = idadeAtual;			
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nomeAtual) {
		this.nome = nomeAtual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSobrenome(String sobrenomeAtual) {
		this.sobrenome = sobrenomeAtual;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String nomeCompleto() {
		return getNome() + " " + getSobrenome();
 	}
	
	public String toString() {
		return "Meu nome é " + nomeCompleto() 
			+ " e tenho " + getIdade() + " anos";
	}
}

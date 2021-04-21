package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		double precoFinal = preco - (preco * desconto);
		return precoFinal;
	}
}

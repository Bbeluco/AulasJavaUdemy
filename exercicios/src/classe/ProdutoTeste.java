package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4325.88);
		
		Produto p2 = new Produto();
		p2.nome = "MousePad";
		p2.preco = 200.00;
		
		double precoComDesconto = p1.precoComDesconto();
		System.out.printf("Preco final do %s: %.2f", 
				p1.nome, precoComDesconto);
	}
}

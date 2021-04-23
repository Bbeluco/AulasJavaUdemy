package oo.componentes.desafio;

public class Sistema {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.adicionarItem("Lapiseira", 1, 1);
		compra1.adicionarItem("Borracha", 1, 0.2);
		compra1.adicionarItem("Bola", 3, 5.5);
		
		Cliente cliente1 = new Cliente("Bruno Beluco");
		cliente1.adicionarCompra(compra1);
		double total  = cliente1.precoTotal();
		
		System.out.println("O preço total foi: " + total);
		
	}
}

package oo.componentes.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, int qtd, double preco) {
		Item i = new Item(new Produto(nome, preco), qtd);
		this.itens.add(i);
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.qtd * item.produto.preco;
		}
		return total;
	}
}

package oo.componentes;

import java.util.ArrayList;

public class Compra {
	String nome;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, int qtd, double preco) {
		this.adicionarItem(new Item(nome, qtd, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this; //Atribuindo o obj item dentro do obj compra
	}
}

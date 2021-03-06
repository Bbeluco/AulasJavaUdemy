package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = 
				p -> System.out.println(p.nome + "!");
				
		Produto p1 = new Produto("Lapis", 1.2, 0.12);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Lapis", 50, 0.30);
		Produto p3 = new Produto("Caderno", 75, 0.1);
		Produto p4 = new Produto("Borracha", 10, 0.02);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}

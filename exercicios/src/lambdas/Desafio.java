package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto p1 = new Produto("iPad", 3235.89, 0.13);
		
		BinaryOperator<Double> desconto = 
				(preco, desc) -> preco - (preco * desc); 
		
		UnaryOperator<Double> imposto = 
				preco -> preco >= 2500 ? preco + (preco * 0.085) : preco;
				
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
				
		
		UnaryOperator<Double> arredondamento = 
				preco -> (double) Math.round(preco * 100) / 100.0;
				
		Function<Double, String> formatacao = 
				preco -> ("R$"+preco).replace(".", ",");
				
		String precoFinal = desconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondamento)
				.andThen(formatacao)
				.apply(p1.preco, p1.desconto);
		System.out.println(precoFinal);
	}
}

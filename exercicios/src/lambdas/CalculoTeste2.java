package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(4, 4));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(4, 4));
		
		/*
		 * Observe que neste exemplo em questao utilizamos a funcao lambda
		 * funcao lambda é igual a arrow function do JavaScript
		 * Para podermos criar uma função lambda apenas precisamos da interface
		 * Apos definirmos o que esperamos do método basta preencher a funcão.
		 */
	}
}

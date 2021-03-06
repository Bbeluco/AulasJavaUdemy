package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	private Utilitarios() {} //Nao permite que a classe seja estanciada
	public final static UnaryOperator<String> maiusculo = n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeira = n -> n.charAt(0) + "";
	
	public final static String grito(String n) {
		return n + "!!! ";
	}
	
	/*
	 * Fizemos esta função grito assim para podermos usar o reference method
	 */
}

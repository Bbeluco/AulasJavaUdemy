package lambdas;

public class CalculoTeste1 {
	public static void main(String[] args) {
		Somar s = new Somar();
		Multiplicar m = new Multiplicar();
		
		System.out.println(s.executar(1, 2));
		System.out.println(m.executar(3, 3));
		
		/*
		 * Perceba que neste exemplo para criarmos um metodo simples
		 * tivemos que criar suas classes, depois instanciar
		 * para só então utilizar.
		 */
	}
}

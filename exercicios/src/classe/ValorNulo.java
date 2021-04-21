package classe;

public class ValorNulo {
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		Produto p1 = Math.random()  > 0.5 ?
				new Produto() : null;
		
		if(p1 != null) {
			p1.nome = "Tablet";
			System.out.println(p1.nome);
		}

		
		/*
		 * O valor null é referente a uma variável que não
		 * aponta para um valor na memória
		 */
	}
}

package classe.desafios;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Bruno";
		p.peso = 76.5;
		
		Comida c = new Comida();
		c.nome = "Costela";
		c.peso = 0.3;
		
		p.comer(c);
		System.out.println(p.peso);
		
	}
}

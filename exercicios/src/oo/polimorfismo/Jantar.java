package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(75.2);
		
		Arroz a = new Arroz(0.3);
		Feijao f = new Feijao(0.2);
		
		p1.comer(a);
		p1.comer(f);
		
		System.out.println(p1.getPeso());
	}
}

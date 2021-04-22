package classe.desafios;

public class Pessoa {
	String nome;
	double peso;
	
	void comer(Comida c) {
		if(c != null) this.peso += c.peso;
	}
}

package oo.heranca.desafios;

public class Ferrari extends Carro implements Esportivo{
	public Ferrari() {
		this(300);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
	public void ligarTurbo() {
		delta = 35;
	}
	
	public void desligarTurbo() {
		delta = 15;
	}
	
//	void acelerar() {
//		this.velocidadeAtual += 15;
//	}
}

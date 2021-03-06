package oo.polimorfismo;

public class Pessoa {
	private double peso;
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public void setPeso(double pesoAtual) {
		if(pesoAtual >= 0) {
			this.peso = pesoAtual;
		}
	}
	
	public double getPeso() {
		return peso;
	}
}

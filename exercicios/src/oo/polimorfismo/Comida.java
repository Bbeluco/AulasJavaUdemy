package oo.polimorfismo;

public abstract class Comida {
	private double peso;
	
	public Comida(double peso) {
		this.peso = peso;
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

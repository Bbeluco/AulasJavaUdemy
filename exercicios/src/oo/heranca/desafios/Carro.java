package oo.heranca.desafios;

public class Carro {
	int velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
		System.out.println("A velocidade maxima foi definida para" + VELOCIDADE_MAXIMA);
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			this.velocidadeAtual += delta;			
		}
	}
	
	public void frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5; 			
		} else {
			this.velocidadeAtual = 0;
		}
	}
	
}

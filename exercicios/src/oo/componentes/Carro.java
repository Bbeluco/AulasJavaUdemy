package oo.componentes;

public class Carro {
	Motor m = new Motor();
	
	void acelerar() {
		if(m.fatorAceleracao < 2.5) {
			m.fatorAceleracao += 0.4;			
		}
	}
	
	void freiar() {
		if(m.fatorAceleracao > 0.5) {
			m.fatorAceleracao -= 0.4;
		}
	}
	
	
	void ligar() {
		m.ligado = true;
	}
	
	void desligar() {
		m.ligado = false;
		
	}
	
	
	boolean estaLigado() {
		return m.ligado;
	}
}

package oo.componentes;

public class Motor {
	double fatorAceleracao = 0.4;
	boolean ligado = false;
	
	int giros() {
		return (int) Math.round(fatorAceleracao * 3000);
	}
}

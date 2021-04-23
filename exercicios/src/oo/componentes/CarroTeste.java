package oo.componentes;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		c1.ligar();
		c1.acelerar();
		System.out.println(c1.m.giros());
				
	}
}

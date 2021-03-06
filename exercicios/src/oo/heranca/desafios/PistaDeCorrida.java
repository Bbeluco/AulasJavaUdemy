package oo.heranca.desafios;

public class PistaDeCorrida {
	public static void main(String[] args) {
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		System.out.println("Ferrari ==> " + ferrari.velocidadeAtual);
		System.out.println("Civic ==> " + civic.velocidadeAtual);
		System.out.println(ferrari.turbina());
		civic.acelerar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println();
		
		System.out.println("Ferrari ==> " + ferrari.velocidadeAtual);
		System.out.println("Civic ==> " + civic.velocidadeAtual);
	}
}

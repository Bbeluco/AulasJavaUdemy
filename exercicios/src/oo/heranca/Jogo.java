package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Heroi j1 = new Heroi(10, 10);
		
		Monstro j2 = new Monstro();
		j2.x = 10;
		j2.y = 11;
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		j1.atacar(j2);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		
	}
}

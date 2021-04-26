package oo.heranca;

public class Monstro extends Jogador {
	public Monstro() {
		this(0,0); //Esse this chama o construtor abaixo
	}
	
	public Monstro(int x, int y){ //Neste construtor passamos os params para o construtor pai
		super(x, y);
	}
}

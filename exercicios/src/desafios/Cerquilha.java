package desafios;

public class Cerquilha {
	public static void main(String[] args) {
		String valor = "#";
		for(int i = 'a'; i < 'e'; i++) {
			System.out.println(valor);
			valor+= "#";
		}
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}

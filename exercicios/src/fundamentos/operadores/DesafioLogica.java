package fundamentos.operadores;

public class DesafioLogica {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean shooping = trabalho1 || trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		
		System.out.println("Vai ao shopping? " + shooping);
		System.out.println("Comprar sorvete? " + sorvete);
		System.out.println("Tem fome? " + !sorvete);
		System.out.println("Tv 50? " + (shooping && tv50));
		System.out.println("Tv 32? " + (shooping && tv32));
	}
}

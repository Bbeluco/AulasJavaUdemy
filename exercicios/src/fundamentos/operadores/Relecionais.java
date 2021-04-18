package fundamentos.operadores;

public class Relecionais {
	public static void main(String[] args) {
		System.out.println(1 == 2);
		System.out.println(1 != 2);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 2);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = passouPorMedia && bomComportamento;
		System.out.println("Tem desconto? " + temDesconto);
	}
}

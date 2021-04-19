package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.6;
		String resultadoFinal = media > 7.0 ? "Aprovado" : "Em recuperação";
		System.out.println(resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = passouPorMedia && bomComportamento;
		String desconto = temDesconto ? "Sim." : "Não";
		System.out.println("Tem desconto? " + desconto);
	}
}

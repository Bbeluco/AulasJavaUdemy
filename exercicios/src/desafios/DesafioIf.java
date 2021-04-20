package desafios;

public class DesafioIf {
	public static void main(String[] args) {
		double nota = 1.3;
		if(nota >= 9.0); {
			System.out.println("PARANBENS");
			System.out.println("VC é fera");
		}
		
		//Neste código o erro esta no ; a frente do if
		//o mesmo faz com que o if finalize
		//assim possibilitando que o bloco fique livre
		//o sistema trata o bloco como se fosse da execução normal
		//e não considere ele como parte do if
	}
}

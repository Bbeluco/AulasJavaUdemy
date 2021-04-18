package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {
		double quocientePrimeiraFracao = Math.pow((6 * (3 + 2)), 2);
		double divisorPrimeiraFracao = 3 * 2;
		double primeiraFracao = quocientePrimeiraFracao 
				/ divisorPrimeiraFracao;
		
		double quocienteSegundaFracao = (1 - 5) * (2 - 7);
		double divisorSegundaFracao = 2;
		double segundaFracao = 
				Math.pow((quocienteSegundaFracao / divisorSegundaFracao), 2);
		
		double quocientePrincial = 
				Math.pow((primeiraFracao - segundaFracao), 3);
		
		double divisorPrincipal = Math.pow(10, 3);
		
		double resultado = quocientePrincial / divisorPrincipal;
		
		System.out.println("O resultado da equação é: " + resultado);
	}
}

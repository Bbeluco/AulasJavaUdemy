package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos numéricos
		byte anosDeEmpresa = 10;
		short numeroDeVoos = 576;
		int id = 5783164;
		long pontosAcumulados = 3_134_845_223L; //"L" no fim indica tipo long
		
		//Tipos numéricos reais
		float salario = 11_445.38F; //"F" no fim indica tipo float
		double vendasAcumuladas = 2_991_797_203.01;
		
		//Tipo boleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println("O funcionário tem " + anosDeEmpresa * 365 
				+ " anos de empresa.");
		
		//Número de viagens
		System.out.println("O funcionário já fez + " + numeroDeVoos 
				+ " viagens a trabalho.");
		
		//Pontos por real
		System.out.println("O funcionário ganha " 
		+ pontosAcumulados / vendasAcumuladas + " pontos a cada 1 real de venda");
		
		//Informações pessoais
		System.out.println("Salário do fúncionario: " + salario);
		System.out.println("Esta de ferias? " + estaDeFerias);
		System.out.println("Status na empresa: " + status);
		System.out.println("Identificação: " + id);
		
		
	}
}

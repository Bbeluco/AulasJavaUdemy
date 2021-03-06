package classe.desafios;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}
	/*
	 * Na linha acima estamos usando o this como método, assim possibilitando
	 * que chamemos o segundo construtor da linha logo abaixo
	 */
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	/*
	 * Usando o this na linha acima para acessar uma variável de instancia
	 * assim, deixando o eclipse diferenciar os argumentos das variáveis
	 */
	
//	String formato = "%d/%d/%d"; //Variável global
	/*
	 * Para criar uma variável global em Java basta ela ser variavel direta
	 * da class ou da instancia
	 */
	String obterDataFormatada() {
		String formato = "%d/%d/%d"; //Variável local
		return String.format(formato, dia, mes, ano);
	}
}

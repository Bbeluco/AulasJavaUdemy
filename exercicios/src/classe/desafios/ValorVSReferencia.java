package classe.desafios;

public class ValorVSReferencia {
	public static void main(String[] args) {
		
		Data d1 = new Data(31, 12, 2020);
		Data d2 = d1;
		
		d1.mes = 06;
		d2.dia = 12;
		System.out.printf(d1.obterDataFormatada());
		
		voltarParaDataPadrao(d1);
		System.out.println();
		
		System.out.printf(d2.obterDataFormatada());
		//Os objetos são passados por referencia, ou seja
		//São referencias que apontam o endereço das variaveis na memória
		
		
		int numero = 3;
		acrescentaMaisUm(numero);
		System.out.println("\n" + numero);
		//Os dados são passados por valores, ou seja
		//São valores clonados que não alteram o conteúdo original do dado
	}
	
	static void voltarParaDataPadrao(Data d) {
		d.dia = 01;
		d.mes = 01;
		d.ano = 1970;
	}
	
	static void acrescentaMaisUm(int a) {
		a++;
	}
}

package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double aa; //Podemos iniciar uma variavel sem valor
		aa = 1.1;
		System.out.println("O valor da variável aa é: " + aa);
		
		double a = 4.5;
		a = 3.3;
		System.out.println("O valor da variável a é: " + a);
		
		//Na inferencia devemos obrigatóriamente atribuir valor na inicialização
		var b = 5.2; //Inferencia do tipo double
		b = 1.9;
		System.out.println("O valor da variável b é: " + b);
		
		/*
		 * var c
		 * c = 1;
		 * 
		 * O exemplo acima não é possivel já que a inferencia
		 * 	deve ser feita assim que a variável é iniciada
		 */
		
		
	}
}

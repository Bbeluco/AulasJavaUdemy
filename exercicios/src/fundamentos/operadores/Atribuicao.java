package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c+=2; // c = c + 2;
		c-=b; // c = c - b;
		c*=b; // c = c * b;
		c/=b; // c = c / b;
		c%=b; // c = c % b; 
		System.out.println(c);
		
		
	}
}

package excecao;

public class MinhaExcecao {
	public static void main(String[] args) {
		int n = -1;
		if(n < 0) {
			throw new NumeroNegativo("Altere o número para positivo");
		}
	}
}

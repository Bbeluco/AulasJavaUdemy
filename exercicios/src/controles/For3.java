package controles;

public class For3 {
	public static void main(String[] args) {
		int a = 0;
		for(; a < 10; a++) {
			System.out.println(a);
		}
		/*
		 * no exemplo acima podemos utilizar uma variável ja fora do for
		 */
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}

package excecao;

public class Basico {
	public static void main(String[] args) {
		try {
			System.out.println(7 / 0);
		} catch(Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}
}

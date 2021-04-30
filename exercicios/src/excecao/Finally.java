package excecao;

public class Finally {
	public static void main(String[] args) {
		try {
			System.out.println(7 / 0);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Finally");
		}
	}
}

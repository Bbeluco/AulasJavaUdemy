package classe;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Bruno";
		u1.email = "bbeluco@emal.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Bruno";
		u2.email = "bbeluco@emal.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}

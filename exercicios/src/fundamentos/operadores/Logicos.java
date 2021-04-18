package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		
		System.out.println(a && !b);
		System.out.println(a || b);
		System.out.println(a ^ b);
		System.out.println(!a);
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NAO (NOT)");
		System.out.println(!true);
		System.out.println(!false);
	}
}

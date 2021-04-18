package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		var x = 3.2;
		double y = 2.58;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 1;
		int b = 4;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double) b);
		
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b);
	}
}

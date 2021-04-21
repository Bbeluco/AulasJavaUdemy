package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(5.5);
		
		System.out.println("Area: " + a1.area());
		System.out.println("Area: " + AreaCirc.area(5.5));
	}
}

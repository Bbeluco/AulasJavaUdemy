package fundamentos;

public class ConversaoTipoPrimitivo {
	public static void main(String[] args) {
		double a = 1; // implicito
		System.out.println(a);
		
		int n = 424;
		byte x = (byte) n; //explicito (CAST) 
		System.out.println(x); 
		
		double b = 1.9999999;
		int c = (int) b; //explicito (CAST)
		System.out.println(c);
		
		
		//Devemos evitar CAST desnecessários haja visto que há uma perda de info
	}
}

package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		String s = "Meu nome é Bruno";
		System.out.println(s.charAt(0));
		
		System.out.println(s.concat("!!!"));
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("M"));
		System.out.println(s.toLowerCase().startsWith("m"));
		System.out.println(s.length());
		System.out.println(s.equals("Meu nome é Bruno"));
		System.out.println(s.equalsIgnoreCase("mEu NoMe É bRUNo"));
		
		var nome = "Bruno";
		var sobrenome = "Beluco";
		var idade = 18;
		var salario = 1579.37F;
		
		System.out.printf("O senhor %s %s tem %d anos, seu salário é de %.2f", 
				nome, sobrenome, idade, salario);
	
		System.out.println("\n\n");
		
		String frase = String.format(
				"O senhor %s %s tem %d anos, seu salário é de %.2f", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}
}

package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Bruno");
		s = s.toUpperCase();
		s = s.concat("!!");
		
		System.out.println(s);
		
		//Tipo primitivos nao tem o operador "."
		//O operador . é responsavel por permitir acesso a metodos internos 
	}
}

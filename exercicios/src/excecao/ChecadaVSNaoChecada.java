package excecao;

public class ChecadaVSNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		try {
			geraErro2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void geraErro1() {
		throw new RuntimeException("Que erro legal #01!");
	}
	
	static void geraErro2() throws Exception { 
		throw new Exception("Que erro legal #01!");
		//Devemos nesse caso informar que estamos cientes que o erro exception sera lançado
	}
}

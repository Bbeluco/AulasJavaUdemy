package excecao;

@SuppressWarnings("serial")
public class NumeroNegativo extends RuntimeException{
	String mensagem;
	public NumeroNegativo(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String getMessage() {
		return mensagem;
	}
	
}

package midianet.admclan.excecao;

public abstract class NegocioExcecao extends Exception {
	private static final long serialVersionUID = 2148531010069920639L;
	
	public NegocioExcecao(final String mensagem){
		super(mensagem);
	}
	
}
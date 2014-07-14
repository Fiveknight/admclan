package midianet.admclan.excecao;

public class InfraExcecao extends Exception {
	private static final long serialVersionUID = -2484122836824739405L;
	
	public InfraExcecao(final String mensagem){
		super(mensagem);
	}
	
	public InfraExcecao(final String mensagem, final Throwable origem){
		super(mensagem,origem);
	}
	
	public InfraExcecao(final Throwable origem){
		super(origem);
	}
	
}
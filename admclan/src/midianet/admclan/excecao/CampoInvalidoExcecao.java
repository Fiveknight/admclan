package midianet.admclan.excecao;

public class CampoInvalidoExcecao extends NegocioExcecao {
	private static final long serialVersionUID = -5243061363574155698L;
	
	public CampoInvalidoExcecao(final String campo, final String explicacao ){
		super("O valor do campo  " + campo + " está inválido, deverá ser : "  + explicacao );
	}
	
}

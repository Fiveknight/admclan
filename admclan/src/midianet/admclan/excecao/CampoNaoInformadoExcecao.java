package midianet.admclan.excecao;

public class CampoNaoInformadoExcecao extends NegocioExcecao {
	private static final long serialVersionUID = 1L;

	public CampoNaoInformadoExcecao(final String campo){
		super("O campo  " + campo + " não foi informado!");
	}
}

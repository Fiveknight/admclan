package midianet.admclan.excecao;

public class SenhaInvalidaExcecao extends NegocioExcecao {
	private static final long serialVersionUID = 1L;

	public SenhaInvalidaExcecao(){
		super("Senha não coincidente!");
	}
}

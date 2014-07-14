package midianet.admclan.excecao;

public class RegistroNaoEncontradoExcecao extends NegocioExcecao {
	private static final long serialVersionUID = -4370411135294584332L;
	
	public RegistroNaoEncontradoExcecao(String tipo, String chave) {
		super("Não foi encontrado o registro do tipo " + tipo + "  com a chave " + chave);
	}
	
}

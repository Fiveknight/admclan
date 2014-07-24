 /*
 * ValorNaoInformadoExcecao.java
 * 
 * Desenvolvido por Midianet.
 *  
 * Todos os direitos reservados.
 */

package midianet.admclan.excecao;

/**
 * Classe que representa a Exceção a ser lançada caso um valor não foi informado e que seja exigido pelo negócio.
 * 
 * @see NegocioExcessao
 * 
 * @author Marcos Fernando Costa.
 */
public class ValorNaoInformadoExcecao extends NegocioExcecao {
	private static final long serialVersionUID = 1897556151978799979L;

	/**
	 * Construtor padrão da Exceção.
	 * 
	 * @param valor nome do campo sem informação.
	 */
	public ValorNaoInformadoExcecao(final String valor){
		super("MSG001",valor);
	}
	
}
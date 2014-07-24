 /*
 * ValorInvalidoExcecao.java
 * 
 * Desenvolvido por Midianet.
 *  
 * Todos os direitos reservados.
 */

package midianet.admclan.excecao;

/**
 * Classe que representa a Exceção a ser lançada caso um valor seja repassado que não atenda 
 * as exigências de negócio.
 * 
 * @see NegocioExcessao
 * 
 * @author Marcos Fernando Costa.
 */
public class ValorInvalidoExcecao extends NegocioExcecao {
	
	private static final long serialVersionUID = -6710031745063894113L;
	
	/**
	 * Construtor padrão da Exceção.
	 * 
	 * @param valor Valor da Mensagem.
	 * @param explicacao Possível explicação do valor inválido e ou valores esperados.
	 */
	public ValorInvalidoExcecao(final String valor, final String explicacao) {
		super("MSG002", valor, explicacao);
	}
	
}
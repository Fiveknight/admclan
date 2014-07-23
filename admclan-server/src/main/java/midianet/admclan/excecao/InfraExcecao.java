/*
 * InfraExcecao.java
 * 
 * Desenvolvido por Midianet.
 *  
 * Todos os direitos reservados.
 */

package midianet.admclan.excecao;

/**
 * <p><b>InfraExcecao</b></p>
 * Classe que representa a exceção genérica para a camdada de infra estrutura (persistência/io).
 *
 * @see Exception
 *
 * @author Marcos Fernando Costa.
 */
public class InfraExcecao extends Exception {
	private static final long serialVersionUID = -6472789855877680893L;
	
	/**
	 * Construtor que recebe uma mensagem pura como argumento.
	 * 
	 * @param mensagem mensagem da exceção.
	 */
	public InfraExcecao(final String mensagem) {
		super(mensagem);
	}
	
	/**
	 * Construtor que recebe uma mensagem pura como argumento a exceção que originou.
	 * 
	 * @param mensagem mensagem da exceção.
	 * @param origem  exceção original.
	 */
	public InfraExcecao(final String mensagem, final Throwable origem) {
		super(mensagem, origem);
	}
	
	/**
	 * Construtor que recebe como argumento a exceção que originou.
	 * 
	 * @param origem  exceção original.
	 */	
	public InfraExcecao(final Throwable origem) {
		super(origem);
	}
	
}
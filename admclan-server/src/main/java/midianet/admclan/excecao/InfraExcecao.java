/*
 * InfraExcecao.java
 * 
 * Criado pela MIDIANET Sistemas Comerciais.
 * Artefato integrante dos ativos de Infra-Estrutura de aplicações JAVA.
 * 
 * Todos os direitos estão reservados.
 */

package midianet.admclan.excecao;

/**
 * <p><b>InfraExcecao</b></p>
 * Classe que representa a excecao genérica para a camdada de persistência.
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
	 * @param mensagem mensagem da excecao.
	 */
	public InfraExcecao(final String mensagem) {
		super(mensagem);
	}
	
	/**
	 * Construtor que recebe uma mensagem pura como argumento a excecao que originou.
	 * 
	 * @param mensagem mensagem da excecao.
	 * @param origem  excecao original.
	 */
	public InfraExcecao(final String mensagem, final Throwable origem) {
		super(mensagem, origem);
	}
	
	/**
	 * Construtor que recebe como argumento a excecao que originou.
	 * 
	 * @param origem  excecao original.
	 */	
	public InfraExcecao(final Throwable origem) {
		super(origem);
	}
	
}
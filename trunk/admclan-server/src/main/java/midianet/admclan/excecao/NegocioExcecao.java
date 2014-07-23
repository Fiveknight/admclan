 /*
 * NegocioExcessao.java
 * 
 * Criado pela MIDIANET Sistemas Comerciais.
 * Artefato integrante dos ativos de Infra-Estrutura de aplicações JAVA.
 * 
 * Todos os direitos estão reservados.
 */

package midianet.admclan.excecao;

/**
 * <p><b>NegocioExcessao</b></p>
 * Classe que representa a excessao genérica para a camada de Negócio.
 *
 * @see Exception
 *
 * @author Marcos Fernando Costa.
 */
public abstract class NegocioExcecao extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construtor que recebe a chave da mensagem no arquivo de mensagens
	 * e seus parametros que são opcionais.
	 * 
	 * Caso deseje mostrar uma mensagem fora do arquivo de mensagens
	 * basta apenas passar a mensagem na integra.
	 * 
	 * @param mensagem chave da mensagem no arquivo de mensagens ou mensagem na integra.
	 * @param parametros lista de parametros opcionais da mensagem.
	 */	
	public NegocioExcecao(final String mensagem ,final Object... parametros){
		super(RepositorioMensagens.obterMensagem(mensagem, parametros));
	}
	
}
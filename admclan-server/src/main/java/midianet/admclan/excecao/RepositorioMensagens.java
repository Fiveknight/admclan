/*
 * RepositorioMensagens.java
  * 
 * Desenvolvido por Midianet.
 *  
 * Todos os direitos reservados.
 */

package midianet.admclan.excecao;

import java.text.MessageFormat;
//import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <p><b>RepositorioMensagens</b></p>
 * Classe que representa o gerenciador de mensagens.
 *
 * @author Marcos Fernando.
 */
public abstract class RepositorioMensagens {
	
	private static ResourceBundle repositorio;
	//private static final Locale PORTUGUES = new Locale("pt_BR");
	
    /**
     * Construtor privado para garantir que a mesma não seja instânciada
     * Apesar de ser abstrata esse método apenas foi criado para satisfazer
     * uma regra do Sonar
     */
    private RepositorioMensagens(){}
	
	/**
	 * Método estático interno que retorna o Bundle (lista de mensagens no arquivo) de mensagens 
	 * para ser utilizado pelos métodos que montam a mensagem.
	 * O arquivo deverá ser chamado de <b>excecoes.properties</b> e deve estar no classpath da aplicações.
	 *  
	 * @return {@link ResourceBundle}
	 * 
	 * @throws InfraExcecao Possível exceção as ser lançada caso não consiga recuperar o arquivo de mensagens.
	 */
	private static ResourceBundle getMensagens() throws InfraExcecao{
		
	    //ResourceBundle mensagens = null;
	    
	    try{
	    	if(repositorio == null){
	    		repositorio = ResourceBundle.getBundle("exceções");	
	    	}
	        
	    }catch(final Exception e){
	        throw new InfraExcecao(e);
	    }
		
		return repositorio;
		
	}
	
	/**
	 * Método estático que retorna uma mensagem parametrizada do arquivo de mensagens ou a mensagem na integra caso não seja encontrada.
	 *  
	 * @param chave Chave da mensagem no arquivo de mensagens
	 * @param parametros Lista de parâmetros para montar a mensagem de  acordo com os parâmetros da mensagem.
	 * 
	 * @return String mensagem montada ou a chave repassada caso a chave não seja encontrada no arquivo de mensagens.
	 */
	public static String obterMensagem(final String chave, final Object... parametros){
		
		String retorno = null;
		
		try{
			final String fonteMensagem = getMensagens().getString(chave);
			retorno = MessageFormat.format(fonteMensagem, parametros);
		}catch(final Exception e){
			retorno = chave;
		}
		
		return retorno;
		
	}
	
}
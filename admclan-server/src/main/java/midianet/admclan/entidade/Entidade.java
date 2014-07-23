/*
 * Entidade.java
 * 
 * Desenvolvido por Midianet.
 *  
 * Todos os direitos reservados.
 */

package midianet.admclan.entidade;

import java.io.Serializable;

/**
 * Classe que representa uma entidade genêrica persistente.
 * 
 * @param <ID> tipo genêrico do identificador da entidade.
 * 
 * @author Marcos Fernando.
 * 
 * @see Enum
 * 
 * @category Dominio
 */ 
 public abstract class Entidade<ID extends Serializable> implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Método que retornoa o Identificador da entidade.
	 * 
	 * @return Serializabe Id identificado da entidade.
	 */
	public abstract ID getId();
	
	/**
	 * Método que atribui o identificador da entidade.
	 * 
	 * @param id identificador.
	 */
	public abstract void setId(final ID id);
	
}
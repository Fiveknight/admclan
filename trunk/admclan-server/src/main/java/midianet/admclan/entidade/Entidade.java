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
 * Interface que representa uma entidade genêrica persistente.
 * 
 * @param <ID> tipo genêrico do identificador da entidade.
 * 
 * @author Marcos Fernando.
 * 
 * @see Enum
 * 
 * @category Dominio
 */ 
 public interface Entidade<ID extends Serializable> extends Serializable{
	
	/**
	 * Método que retornoa o Identificador da entidade.
	 * 
	 * @return Serializabe Id identificado da entidade.
	 */
	ID getId();
	
	/**
	 * Método que atribui o identificador da entidade.
	 * 
	 * @param id identificador.
	 */
	void setId(final ID id);
	
}
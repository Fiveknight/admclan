/*
 *  Cargo.java
 * 
 *  Desenvolvido por Midianet.
 *  
 *  Todos os direitos reservados.
 */

package midianet.admclan.constante;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Enumerador que representa o cargo de um membro.
 * 
 * @author Marcos Fernando.
 * 
 * @see Enum
 * 
 * @category Dominio
 */
@XmlType
@XmlEnum
public enum Cargo {
	
	/**
	 * Lider  - Lider/Co-Lider do clan.
	 * Anciao - Membro responsável com atribuições.
	 * Membro - Membro básido co clan. 
	 */
	Lider(1), Anciao(2), Membro(3);
	
	private final int valor;
	
	/**
	 * Construtor do enumerador que recebe o valor do mesmo que poderá ser um dos itens acima.
	 * 
	 * @param valor valor do enumerador.
	 */
	Cargo(final int valor){
		this.valor = valor;
	}
	
	/**
	 * Método que retorna o valor do enumerador.
	 * 
	 * @return int valor atual.
	 */
	public int getValor(){
		return valor;
	}
	
}
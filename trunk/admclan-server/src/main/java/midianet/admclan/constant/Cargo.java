/*
 * 
 */

package midianet.admclan.constant;

/**
 * 
 * @author marcosfernandocosta
 *
 */
public enum Cargo {
	
	/**
	 * 
	 */
	Lider(1), Anciao(2), Membro(3);
	
	private final int valor;
	
	/**
	 * 
	 * @param valor
	 */
	Cargo(final int valor){
		this.valor = valor;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getValor(){
		return valor;
	}
	
}
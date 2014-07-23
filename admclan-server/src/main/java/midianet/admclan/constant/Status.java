
/*
 * 
 */

package midianet.admclan.constant;

/**
 * 
 * @author marcosfernandocosta
 *
 */
public enum Status {
	
	/**
	 * 
	 */
	Ativo(1), Inativo(0);
	
	private final int valor;
	
	/**
	 * 
	 * @param valor
	 */
	Status(final int valor){
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
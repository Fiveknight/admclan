/*
 *  Status.java
 * 
 *  Desenvolvido por Midianet.
 *  
 *  Todos os direitos reservados.
 */

package midianet.admclan.constante;

/**
 * Enumerador que descreve o Status de uma entidade.
 * 
 * @author Marcos Fernando.
 * 
 * @see Enum
 * 
 * @category Dominio
  */
public enum Status {
	
	/**
	 * Ativo   - Entidade em atividade.
	 * Inativo - Entidade desativada.
	 */
	Ativo(1), Inativo(0);
	
	private final int valor;
	
	/**
	 * Construtor do enumerador que recebe o valor do mesmo que poderá ser um dos itens acima.
	 * 
	 * @param valor valor do enumerador.
	 */
	Status(final int valor){
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
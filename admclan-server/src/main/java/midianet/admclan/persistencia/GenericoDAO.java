package midianet.admclan.persistencia;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import midianet.admclan.entidade.Entidade;
import midianet.admclan.excecao.InfraExcecao;

import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericoDAO<T extends Entidade<?>>{
	
	@PersistenceContext
	protected EntityManager persistencia;
	
	@SuppressWarnings("unchecked")
	protected Class<T> getClasse(){
		return ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}
	
	public void incluir(final T entidade) throws InfraExcecao{
		try{
			persistencia.persist(entidade);
		}catch(final Exception e){
			throw new InfraExcecao(e);
		}
	}
	
	public void alterar(final T entidade) throws InfraExcecao{
		try{
			persistencia.merge(entidade);
			persistencia.flush();
		}catch(final Exception e){
			throw new InfraExcecao(e);
		}
	}
	
	public T obterPorId(final Serializable id) throws InfraExcecao{
		try{
			return persistencia.find(getClasse(), id);
		}catch(final Exception e){
			throw new InfraExcecao(e);
		}
	}
	
	public void excluir(final T entidade) throws InfraExcecao{
		try{
			final T persistente = obterPorId(entidade.getId());
			
			if(persistente != null){
				persistencia.remove(persistente);
			}
		}catch(final Exception e){
			throw new InfraExcecao(e);
		}
	}
	
	public void excluirPorId(final Serializable id) throws InfraExcecao {
		try{
			final T persistente = obterPorId(id);
			
			if(persistente != null){
				persistencia.remove(persistente);
			}
		}catch(final Exception e){
			throw new InfraExcecao(e);
		}
	}
		
	@SuppressWarnings("unchecked")
	public List<T> listarTodos() throws InfraExcecao{
		try{
			
			final Query pesquisa = persistencia.createQuery(" from " + getClasse().getSimpleName());
			
			return pesquisa.getResultList();
			
		}catch(final Exception e){
			throw new InfraExcecao(e);
		}
	}
}
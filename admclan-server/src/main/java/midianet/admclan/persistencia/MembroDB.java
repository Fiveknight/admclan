package midianet.admclan.persistencia;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.InfraExcecao;

import org.springframework.stereotype.Repository;

@Repository
public class MembroDB extends GenericoDAO<Membro> {

	
	public Membro obterMembroPorEmail(final String email) throws InfraExcecao{
		
		Membro retorno = null;
		
		try{
			final Query consulta = persistencia.createNamedQuery("membro.obterPorEmail");
			consulta.setParameter("email",email);
			
			retorno = (Membro) consulta.getSingleResult();
		}catch(final NoResultException e){
			
		}catch(final Exception e){
			throw new InfraExcecao(e);
		}
		
		return retorno;
		
	}
	
}
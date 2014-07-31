package midianet.admclan.servico;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.InfraExcecao;
import midianet.admclan.excecao.ValorNaoInformadoExcecao;
import midianet.admclan.persistencia.MembroDB;
import midianet.admclan.to.MembroVO;

import org.springframework.stereotype.Controller;


@Controller
@Path("/login")
public class LoginSR {
	
	@Resource
	private MembroDB dao;
	
	/**
	 * Método que retorna o membro por seu identificador.
	 * 
	 * @param id Identificador do membro.
	 * @return Membro Membro encontrado como o identificador informado.
	 * @throws InfraExcecao Possível exceção a ser lançada caso ocorra algum problema ao interagir com o banco de dados.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Membro login(@QueryParam("email") String email, @QueryParam("senha") String senha) throws ValorNaoInformadoExcecao, InfraExcecao {
		
		if(email == null){
			throw new ValorNaoInformadoExcecao("email");
		}
		
		if(senha == null){
			throw new ValorNaoInformadoExcecao("senha");
		}
		
		Membro membro = dao.obterPorId(1L);

		return membro;
		
	}	
}
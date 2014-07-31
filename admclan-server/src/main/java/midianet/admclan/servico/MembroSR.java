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

import org.springframework.stereotype.Controller;


@Controller
@Path("/membro")
public class MembroSR {
	
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
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Membro obterPorId(@PathParam("id") Long id) throws ValorNaoInformadoExcecao, InfraExcecao {
		
		if(id == null){
			throw new ValorNaoInformadoExcecao("identificador");
		}
		
		Membro membro = dao.obterPorId(id);

		return membro;
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Membro obterPorEmail(@QueryParam("email") String email, @QueryParam("senha") String senha) throws ValorNaoInformadoExcecao, InfraExcecao {
		
		
		
		return null;
		
	}
	
//	/**
//	 * Método que cria o membro através de seu e-mail.
//	 * 
//	 * @param email email do membro.
//	 * 
//	 * @throws InfraExcecao Possível exceção a ser lançada caso ocorra algum problema ao interagir com o banco de dados. 
//	 */
//	@RequestMapping(value = "/{email}", method = RequestMethod.PUT)	
//	public void criarMembro(final String email) throws ValorNaoInformadoExcecao, ValorInvalidoExcecao, InfraExcecao{
//		
//		if(email == null || email.isEmpty()){
//			throw new ValorNaoInformadoExcecao("email"); 
//		}
//		
//		if(!email.contains("@") &&  !email.contains(".") ){
//			throw new ValorInvalidoExcecao("email", "deverá conter @ e .");
//		}
//		
//		final Membro membro = new Membro();
//		membro.setEmail(email);
//		
//		//Monta a senha inicial [inicial do email + data atual
//		final String senha = email.substring(0,email.indexOf("@")).concat(Data.getDataFormatada("DMYY"));
//		
//		membro.setSenha   (senha);
//		membro.setCadastro(new Date());
//		membro.setCargo   (Cargo.Membro);
//		membro.setStatus  (Status.Inativo);
//		
//		dao.incluir(membro);
//		//System.out.println("enviar email para " + email);
//		
//	}
	
}
package midianet.admclan.servico;

import javax.annotation.Resource;

import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.InfraExcecao;
import midianet.admclan.persistencia.MembroDB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/membro")
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
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody Membro obterPorId(@PathVariable long id) throws InfraExcecao{
		
		return dao.obterPorId(id);
		
	}
	
	/**
	 * Método que cria o membro através de seu e-mail.
	 * 
	 * @param email email do membro.
	 * 
	 * @throws InfraExcecao Possível exceção a ser lançada caso ocorra algum problema ao interagir com o banco de dados. 
	 */
	@RequestMapping(value = "{email}", method = RequestMethod.PUT)	
	public void criarMembro(final String email) throws InfraExcecao{
		
		if(email == null || email.isEmpty()){
			//throw new 
		}
		
		final Membro membro = new Membro();
		membro.setEmail(email);
		
		dao.incluir(membro);
		//System.out.println("enviar email para " + email);
		
	}
	
}
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
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody
	Membro obterPorId(@PathVariable long id) throws InfraExcecao{
		
		return dao.obterPorId(id);
		
	}
	
}
package midianet.admclan.servico;

import midianet.admclan.entidade.Membro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/membro")
public class MembroSR {
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody
	Membro obterPorId(@PathVariable long id) {
		
		return null;
		
	}
	
}
package midianet.admclan.servico;

import java.util.Date;

import javax.annotation.Resource;

import midianet.admclan.constante.Cargo;
import midianet.admclan.constante.Status;
import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.InfraExcecao;
import midianet.admclan.excecao.ValorInvalidoExcecao;
import midianet.admclan.excecao.ValorNaoInformadoExcecao;
import midianet.admclan.persistencia.MembroDB;
import midianet.admclan.util.Data;

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
	public @ResponseBody Membro obterPorId(@PathVariable Long id) throws ValorNaoInformadoExcecao, InfraExcecao {
		
		if(id == null){
			throw new ValorNaoInformadoExcecao("identificador");
		}
		
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
	public void criarMembro(final String email) throws ValorNaoInformadoExcecao, ValorInvalidoExcecao, InfraExcecao{
		
		if(email == null || email.isEmpty()){
			throw new ValorNaoInformadoExcecao("email"); 
		}
		
		if(!email.contains("@") &&  !email.contains(".") ){
			throw new ValorInvalidoExcecao("email", "deverá conter @ e .");
		}
		
		final Membro membro = new Membro();
		membro.setEmail(email);
		
		//Monta a senha inicial [inicial do email + data atual
		final String senha = email.substring(0,email.indexOf("@")).concat(Data.getDataFormatada("DMYY"));
		
		membro.setSenha   (senha);
		membro.setCadastro(new Date());
		membro.setCargo   (Cargo.Membro);
		membro.setStatus  (Status.Inativo);
		
		dao.incluir(membro);
		//System.out.println("enviar email para " + email);
		
	}
	
}
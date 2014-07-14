package midianet.admclan.negocio;

import java.util.List;

import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.CampoNaoInformadoExcecao;
import midianet.admclan.excecao.InfraExcecao;
import midianet.admclan.excecao.RegistroNaoEncontradoExcecao;
import midianet.admclan.excecao.SenhaInvalidaExcecao;
import midianet.admclan.persistencia.MembroDAO;

public class MembroNegocio {

	private MembroDAO dao;

	public MembroNegocio(){
		dao = new MembroDAO();
	}
	
	public Membro login(final String email, final String senha) throws CampoNaoInformadoExcecao , RegistroNaoEncontradoExcecao, SenhaInvalidaExcecao, InfraExcecao{
		Membro retorno = null;
		
		if(email == null || email.isEmpty()){
			throw new CampoNaoInformadoExcecao("Email");
		}
		
		if(senha == null || senha.isEmpty()){
			throw new CampoNaoInformadoExcecao("Senha");
		}
		
		retorno = dao.obterMembroPorEmail(email);
		
		if(retorno == null){
			throw new RegistroNaoEncontradoExcecao("Membro", email);
		}
		
		if(!retorno.getSenha().equals(senha) ){
			throw new SenhaInvalidaExcecao();
		}
		
		return retorno;
		
	}
	
	public List<Membro> listarTodosMembros() throws InfraExcecao{
		return dao.listarTodos();
	}
	
}
package midianet.admclan.persistencia;

import java.util.ArrayList;
import java.util.List;

import midianet.admclan.R;
import midianet.admclan.entidade.Cargo;
import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.InfraExcecao;

//MOCK
public class MembroDAO {
	private List<Membro> membros = null;
	
	public MembroDAO(){
		construirListaMock();
	}
	
	public Membro obterMembroPorEmail(String email) throws InfraExcecao{
		
		Membro retorno = null;
		
		for(Membro membro : membros){
			
			if(membro.getEmail().equals(email)){
				retorno = membro;
				break;
			}
		}
		
		return retorno;
	}
	
	public List<Membro> listarTodos() throws InfraExcecao{
		return membros;
	}
	
	private void construirListaMock(){
		membros = new ArrayList<Membro>();
		
		Membro membro = new Membro();
		membro.setId(1L);
		membro.setNome("Marcos Fernando");
		membro.setEmail("midianet@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(1L);
		membro.getCargo().setNome("Lider");
		membro.setFoto(R.drawable.ic_launcher);
		membro.setSenha("123");
		membros.add(membro);
		
		membro = new Membro();
		membro.setId(2L);
		membro.setNome("Marlon");
		membro.setEmail("viado@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(1L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Lider");
		membro.setSenha("123");
		membros.add(membro);
		
		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Carol");
		membro.setEmail("maezinha@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(1L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Lider");
		membro.setSenha("123");
		membros.add(membro);
		
		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Timacu");
		membro.setEmail("timacu@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(1L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Lider");
		membro.setSenha("123");
		membros.add(membro);
		
		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Denis");
		membro.setEmail("denis@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(1L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Lider");
		membro.setSenha("123");
		membros.add(membro);

		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Zaibak");
		membro.setEmail("zai@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(2L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Ancião");
		membro.setSenha("123");
		membros.add(membro);
		
		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Rey Marlon");
		membro.setEmail("rei@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(3L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Membro");
		membro.setSenha("123");
		membros.add(membro);		
		
		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Glauce");
		membro.setEmail("glauce@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(3L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Membro");
		membro.setSenha("123");
		membros.add(membro);
		
		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Pabuko");
		membro.setEmail("pabuko@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(3L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Membro");
		membro.setSenha("123");
		membros.add(membro);
		
		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Thor");
		membro.setEmail("thor@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(3L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Membro");
		membro.setSenha("123");
		membros.add(membro);
		
		membro = new Membro();
		membro.setId(3L);
		membro.setNome("Baroni");
		membro.setEmail("baroni@gmail.com");
		membro.setCargo(new Cargo());
		membro.getCargo().setId(3L);
		membro.setFoto(R.drawable.ic_launcher);
		membro.getCargo().setNome("Membro");
		membro.setSenha("123");
		membros.add(membro);
	}
	
}
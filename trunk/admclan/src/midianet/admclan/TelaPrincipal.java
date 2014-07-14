package midianet.admclan;

import java.util.List;

import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.InfraExcecao;
import midianet.admclan.negocio.MembroNegocio;
import midianet.admclan.visao.adaptador.MembroAdaptador;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TelaPrincipal extends Activity {

	private ListView lsMembros = null;
	private MembroNegocio membroNegocio = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.principal);
		
		lsMembros = (ListView) findViewById(R.id.lsMembros);
		
		membroNegocio = new MembroNegocio();
		
		List<Membro> membros = null;
		
		try {
			membros = membroNegocio.listarTodosMembros();
			ArrayAdapter<Membro> adaptadorMembros = new MembroAdaptador(this, membros);
	        lsMembros.setAdapter(adaptadorMembros); 
		} catch (InfraExcecao e) {

		}
		
	}
	
}
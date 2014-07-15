package midianet.admclan;

import java.util.List;

import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.InfraExcecao;
import midianet.admclan.negocio.MembroNegocio;
import midianet.admclan.visao.adaptador.MembroAdaptador;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class TelaPrincipal extends Activity {

	private ListView lsMembros = null;
	private ImageButton btNovo  = null;
	private MembroNegocio membroNegocio = null;
	private List<Membro> membros = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.principal);
		
		lsMembros = (ListView) findViewById(R.id.lsMembros);
		btNovo    = (ImageButton) findViewById(R.id.btNovo);
		btNovo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				final Intent telaMembroNovo = new Intent(TelaPrincipal.this,TelaMembroNovo.class);
				startActivity(telaMembroNovo);
			}
		});
		
		
		membroNegocio = new MembroNegocio();
		try {
			membros = membroNegocio.listarTodosMembros();
			ArrayAdapter<Membro> adaptadorMembros = new MembroAdaptador(this, membros);
	        lsMembros.setAdapter(adaptadorMembros); 
		} catch (InfraExcecao e) {

		}
		
	}
	
}
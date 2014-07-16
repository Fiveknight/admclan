package midianet.admclan;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class TelaMembroNovo extends Activity  {
	
	private DatePicker dpNascimento = null;
	private Button     btNascimento = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.membro_novo);

		dpNascimento = (DatePicker) findViewById(R.id.dpNascimento);
		btNascimento = (Button) findViewById(R.id.btNascimento);
		
		btNascimento.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
		});
		
	}
	
	protected Dialog onCreateDialog(int id){
		
		Dialog retorno = null;
		
//		switch (id){
//			case DATA_NASCIMENTO_DIALOGO_ID:
//				
//				final Calendar calendario = Calendar.getInstance();
//				ano = calendario.get(Calendar.YEAR);
//				mes = calendario.get(Calendar.MONTH);
//				dia = calendario.get(Calendar.DAY_OF_MONTH);
//				
//				retorno = new DatePickerDialog(this,dataNascimentoOuvinte, ano, mes, dia);
//		}
		
		return retorno;
	}
	
	private DatePickerDialog.OnDateSetListener dataNascimentoOuvinte = new DatePickerDialog.OnDateSetListener() {
		
		@Override
		public void onDateSet(DatePicker componente, int ano, int mes, int dia) {
			
			final String data = new StringBuilder().append(dia).append("/").append(mes +1).append("/").append(ano).toString();
			
			Toast.makeText(TelaMembroNovo.this,  new StringBuilder().append("DATA = ").append(data).toString(),Toast.LENGTH_LONG).show();
		}
	};
	
}
package midianet.admclan;

import midianet.admclan.entidade.Membro;
import midianet.admclan.excecao.InfraExcecao;
import midianet.admclan.excecao.NegocioExcecao;
import midianet.admclan.negocio.MembroNegocio;
import midianet.admclan.util.AndroidUtil;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TelaLogin extends Activity {
	private MembroNegocio membroNegocio = null;
	
	
	private Button	 btLogin = null; 
	private EditText txEmail = null; 
	private EditText txSenha = null; 
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		btLogin = (Button)  findViewById(R.id.btLogin);
		txEmail = (EditText) findViewById(R.id.txEmail);
		txSenha = (EditText) findViewById(R.id.txSenha);
		
		membroNegocio = new MembroNegocio();
		
		//TODO: Substituir por algo semelhante a cookie
		txEmail.setText("midianet@gmail.com");
		txSenha.setText("123");
		
		btLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
					final Intent telaPrincipal = new Intent(TelaLogin.this,TelaPrincipal.class);
					final Membro membro = membroNegocio.login(txEmail.getText().toString(),txSenha.getText().toString());
					
					telaPrincipal.putExtra("email",membro.getEmail());
					startActivity(telaPrincipal);
					
				}catch(NegocioExcecao e){
					AndroidUtil.mostrarMensagemAlerta(TelaLogin.this, e.getMessage());						
				}catch(InfraExcecao e ){
					AndroidUtil.mostrarMensagemErro(TelaLogin.this, e.getMessage());
				}
			}
		});
		
	}
	
}
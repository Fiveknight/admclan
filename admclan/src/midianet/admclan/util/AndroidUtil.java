package midianet.admclan.util;

import android.app.AlertDialog;
import android.content.Context;

public class AndroidUtil {
	
	public static void mostrarMensagemAlerta(final Context contexto, final String mensagem){
		
		final AlertDialog dlMensagem = new AlertDialog.Builder(contexto).create();
		
		dlMensagem.setTitle("Adm-Clan");
		dlMensagem.setMessage(mensagem);
		dlMensagem.setCancelable(false);
		dlMensagem.show();
	}

	public static void mostrarMensagemErro(final Context contexto, final String mensagem){
		
		final AlertDialog dlMensagem = new AlertDialog.Builder(contexto).create();
		
		dlMensagem.setTitle("Adm-Clan");
		dlMensagem.setMessage(mensagem);
		dlMensagem.setCancelable(false);
		dlMensagem.show();
	}	
	
}

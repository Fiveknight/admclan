package midianet.admclan.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	
	
	public static String getDataFormatada(final Date data, final String formato){
		
		final SimpleDateFormat formatador = new SimpleDateFormat(formato);
		
		return formatador.format(data);
		
	}
	
	public static String getDataFormatada(final String formato){
		
		final SimpleDateFormat formatador = new SimpleDateFormat(formato);
		
		return formatador.format(new Date());
	}
	
	public static String getDataFormatada(final Date data){
		
		final SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		return formatador.format(data);
	}

}

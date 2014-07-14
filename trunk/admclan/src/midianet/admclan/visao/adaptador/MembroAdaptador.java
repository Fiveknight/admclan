package midianet.admclan.visao.adaptador;


import java.util.List;

import midianet.admclan.R;
import midianet.admclan.entidade.Membro;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MembroAdaptador extends ArrayAdapter<Membro> {
	
	 private Context contexto;
	 private List<Membro> membros = null;
	    
	    public MembroAdaptador(Context contexto,  List<Membro> membros) {
	        super(contexto,0, membros);
	        this.membros = membros;
	        this.contexto = contexto;
	    }
	    
	    @Override
	    public View getView(int position, View visao, ViewGroup pai) {
	        Membro membro = membros.get(position);
	        
	        if(visao == null){
	            visao = LayoutInflater.from(contexto).inflate(R.layout.item_membro,null);
	        }
	        
	        ImageView imagemMembro = (ImageView) visao.findViewById(R.id.imMembro);
	        imagemMembro.setImageResource(membro.getFoto());
	         
	        TextView txNomeMembro = (TextView) visao.findViewById(R.id.txNomeMembro);
	        txNomeMembro.setText(membro.getNome());
	         
	        TextView txCargoMembro = (TextView) visao.findViewById(R.id.txCargoMembro);
	        txCargoMembro.setText(membro.getCargo().getNome());
	        
	        return visao;
	    }
}

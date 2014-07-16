package midianet.admclan;

import java.util.Calendar;
import java.util.StringTokenizer;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class Teste extends Activity {
	
private EditText txtView;
private String initialDate;
private String initialMonth;
private String initialYear;
private DatePickerDialog dialog = null;
Context context;
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.teste);
    Button btn = (Button) findViewById(R.id.button1);
    txtView = (EditText) findViewById(R.id.textView1);
    context = getApplicationContext();
    btn.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Calendar dtTxt = null;

          String preExistingDate = (String) txtView.getText().toString();
          
          if(preExistingDate != null && !preExistingDate.equals("")){
              StringTokenizer st = new StringTokenizer(preExistingDate,"/");
                  initialMonth = st.nextToken();
                  initialDate = st.nextToken();
                  initialYear = st.nextToken();
                  if(dialog == null)
                  dialog = new DatePickerDialog(v.getContext(),
                                   new PickDate(),Integer.parseInt(initialYear),
                                   Integer.parseInt(initialMonth)-1,
                                   Integer.parseInt(initialDate));
                  dialog.updateDate(Integer.parseInt(initialYear),
                                   Integer.parseInt(initialMonth)-1,
                                   Integer.parseInt(initialDate));
                  
          } else {
              dtTxt = Calendar.getInstance();
              if(dialog == null)
              dialog = new DatePickerDialog(v.getContext(),new PickDate(),dtTxt.getTime().getYear(),dtTxt.getTime().getMonth(),
                                                  dtTxt.getTime().getDay());
              dialog.updateDate(dtTxt.getTime().getYear(),dtTxt.getTime().getMonth(),
                                                  dtTxt.getTime().getDay());
          }
            
            dialog.show();
        }
        
    });
}
private class PickDate implements DatePickerDialog.OnDateSetListener {

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear,
            int dayOfMonth) {
        view.updateDate(year, monthOfYear, dayOfMonth);
        txtView.setText(monthOfYear+"/"+dayOfMonth+"/"+year);
        dialog.hide();
    }
    
}
}
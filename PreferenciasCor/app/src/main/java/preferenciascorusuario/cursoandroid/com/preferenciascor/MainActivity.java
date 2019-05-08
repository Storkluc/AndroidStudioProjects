package preferenciascorusuario.cursoandroid.com.preferenciascor;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonSelection;
    private Button betaSalver;
    private RelativeLayout layout;
    private static final String AQUINO_PREFERENCE = "ArqPreference";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupId);
        betaSalver = findViewById(R.id.botaoSalvar);
        layout = findViewById(R.id.layoutId);

        betaSalver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int idRadioButtonSelected = radioGroup.getCheckedRadioButtonId();


                if(idRadioButtonSelected>0){
                    radioButtonSelection = findViewById(idRadioButtonSelected);

                    SharedPreferences sharedPreferences = getSharedPreferences(AQUINO_PREFERENCE,0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    String corSelected = radioButtonSelection.getText().toString();
                    editor.putString("corEscorted",corSelected);
                    editor.commit();


                }

            }
        });

        //Recuperate cor salve
        SharedPreferences sharedPreferences = getSharedPreferences(AQUINO_PREFERENCE,0);
        if(sharedPreferences.contains("corEscorted")){
            String corRecuperate = sharedPreferences.getString("corEscorted", "Orange");
            setBackgrounds(corRecuperate);
        }
    }

    private void setBackgrounds(String cor){
        if (cor.equals("Blue")){
            layout.setBackgroundColor(Color.parseColor("#495b7c"));

        }else if(cor.equals("Red")){
            layout.setBackgroundColor(Color.parseColor("FACT3B3B"));

        }else if (cor.equals("Verde")){
            layout.setBackgroundColor(Color.parseColor("009670"));

        };

    }
}

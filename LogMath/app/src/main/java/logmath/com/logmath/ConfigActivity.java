package logmath.com.logmath;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ConfigActivity extends Activity {

    private Button informarProblema;
    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoSalvar;
    private TextView botaoSobre;
    private static final String ARQ_PREFERENCES = "ArqPreferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        informarProblema = findViewById(R.id.informarproblemaId);
        radioGroup = findViewById(R.id.radioGroupId);
        botaoSalvar = findViewById(R.id.botaoSalvarId);


        informarProblema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConfigActivity.this,InformarProblemaActivity.class));
            }
        });

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int idBetaSelection = radioGroup.getCheckedRadioButtonId();

                if(idBetaSelection>0){
                    radioButtonEscolhido = findViewById(idBetaSelection);

                    SharedPreferences sharedPreferences = getSharedPreferences(ARQ_PREFERENCES,0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    String tipoSelecionado = radioButtonEscolhido.getText().toString();
                    editor.putString("tipoEscolhido",radioButtonEscolhido.getText().toString());
                    editor.commit();
                    Toast.makeText(ConfigActivity.this,"Opção Selecionada",Toast.LENGTH_SHORT).show();


                }
            }
        });

        /*botaoSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConfigActivity.this,SobreLogMath.class));
            }
        });*/

    }
}

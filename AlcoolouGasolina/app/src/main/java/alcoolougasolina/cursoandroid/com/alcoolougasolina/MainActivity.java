package alcoolougasolina.cursoandroid.com.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText)findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText)findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button)findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView)findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recuperar valores digitados
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasoline = precoGasolina.getText().toString();

                //Converter valores
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasoline);

                //Cálculo
                double resultado = valorAlcool/valorGasolina;

                if(resultado >= 0.7){
                    textoResultado.setText("É melhor utilizar Gasolina");
                }else{
                    textoResultado.setText("É melhor utilizar Alcool");

                }
            }
        });
    }
}

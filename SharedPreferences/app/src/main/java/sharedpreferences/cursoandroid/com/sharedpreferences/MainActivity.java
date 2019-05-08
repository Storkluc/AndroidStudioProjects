package sharedpreferences.cursoandroid.com.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textoNome;
    private Button botaoSalvar;
    private TextView textoExibicao;
    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNome = (EditText) findViewById(R.id.nomeId);
        botaoSalvar = (Button) findViewById(R.id.botaoSalvarId);
        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);


        //botaoSalvar salva dados no sharedPreferences
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if(textoNome.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Digite um nome", Toast.LENGTH_SHORT).show();
                }else{
                    editor.putString("nome",textoNome.getText().toString());
                    editor.commit();
                    textoExibicao.setText(textoNome.getText().toString());
                }

            }
        });

        //Exibindo dados na tela para o usuário
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
        if(sharedPreferences.contains("nome")){
            String nomeUsuario = sharedPreferences.getString("nome","Usuário não definido");
            textoExibicao.setText("Olá" + textoExibicao.getText().toString());
        }else{
            textoExibicao.setText("Olá, usuário não identificado");
        }

    }

}

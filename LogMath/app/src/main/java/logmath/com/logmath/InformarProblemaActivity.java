package logmath.com.logmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InformarProblemaActivity extends AppCompatActivity {

    private Button botaoVoltarConfiguracoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informar_problema);

        botaoVoltarConfiguracoes = findViewById(R.id.botaoVoltarConfiguracoes);

        botaoVoltarConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformarProblemaActivity.this,ConfiguracoesActivity.class));
            }
        });


    }
}

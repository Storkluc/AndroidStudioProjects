package logmath.com.logmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import faseslogmath.com.logmath.Mapa;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private ImageView botaoConfig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoConfig = findViewById(R.id.botaoConfigId);
        botaoJogar = findViewById(R.id.botaoJogarId);

        botaoConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ConfiguracoesActivity.class));
            }
        });

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Mapa.class));
            }
        });



    }
}

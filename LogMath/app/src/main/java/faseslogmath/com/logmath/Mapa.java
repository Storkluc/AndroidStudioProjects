package faseslogmath.com.logmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import logmath.com.logmath.MainActivity;
import logmath.com.logmath.R;

public class Mapa extends AppCompatActivity {

    private ImageView proximaPagina;
    private ImageView voltarPagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        proximaPagina = (ImageView) findViewById(R.id.proximoId);
        voltarPagina = (ImageView) findViewById(R.id.voltarId);

        proximaPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mapa.this,EstagioUm.class));
            }
        });

        voltarPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mapa.this, MainActivity.class));
            }
        });
    }
}

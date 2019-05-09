package faseslogmath.com.logmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import logmath.com.logmath.MainActivity;
import logmath.com.logmath.R;

public class ComecarActivity extends Activity {

    private Button botaoContinua;
    private Button botaoVoltaMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comecar);

        botaoContinua = findViewById(R.id.botaoContinuarId);
        botaoVoltaMenu = findViewById(R.id.botaoVoltarMenuId);

        botaoContinua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ComecarActivity.this,EstagioUm.class));
            }
        });

        botaoVoltaMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ComecarActivity.this, MainActivity.class));
            }
        });
    }




}

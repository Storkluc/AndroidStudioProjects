package logmath.com.logmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobreLogMath extends AppCompatActivity {

    private Button botaoVoltarInformarProblema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_log_math);

        botaoVoltarInformarProblema = findViewById(R.id.botaoVoltarInformarProblemaId);

        botaoVoltarInformarProblema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SobreLogMath.this, InformarProblemaActivity.class));
            }
        });
    }
}

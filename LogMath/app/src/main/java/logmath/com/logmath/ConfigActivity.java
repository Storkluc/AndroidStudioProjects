package logmath.com.logmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigActivity extends AppCompatActivity {

    private Button informarProblema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        informarProblema = (Button) findViewById(R.id.informarproblemaId);

        informarProblema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConfigActivity.this,InformarProblemaActivity.class));
            }
        });
    }
}

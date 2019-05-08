package logmath.com.logmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ConfigActivity extends AppCompatActivity {

    private Button informarProblema;
    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private CheckBox som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        informarProblema = (Button) findViewById(R.id.informarproblemaId);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);

        informarProblema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConfigActivity.this,InformarProblemaActivity.class));
            }
        });
    }
}

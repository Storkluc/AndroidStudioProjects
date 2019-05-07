package checkbox.cursoandroid.com.checkbox;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    private CheckBox checkBoxcao;
    private CheckBox checkBoxgato;
    private CheckBox checkBoxpapagaio;

    private Button botaoMostrar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxcao = (CheckBox) findViewById(R.id.checkBoxCaoId);
        checkBoxgato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        checkBoxpapagaio = (CheckBox) findViewById(R.id.checkBoxPapagaioId);

        botaoMostrar = (Button) findViewById(R.id.botaoMostrarId);
        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String itensSelecionados = "";

                itensSelecionados += "item: " + checkBoxgato.getText() + "Status: " + checkBoxgato.isChecked() + "\n";
                itensSelecionados += "item: " + checkBoxcao.getText() + "Status: " + checkBoxcao.isChecked()+ "\n";
                itensSelecionados += "item: " + checkBoxpapagaio.getText() + "Status: " + checkBoxpapagaio.isChecked();

                textoExibicao.setText(itensSelecionados);
            }
        });
    }
}

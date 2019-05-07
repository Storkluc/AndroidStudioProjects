package dialog.cursoandroid.com.dialog;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Criar alert Dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //Configurar Títuto
                dialog.setTitle("Alerta");

                //Configurar a mensagem
                dialog.setMessage("Você terá cuidado");

                //Impedir fechamento
                dialog.setCancelable(false);

                dialog.setIcon(android.R.drawable.ic_delete);

                //Configurar botao negativo
                dialog.setNegativeButton("Não",

                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Pressionado botão não", Toast.LENGTH_SHORT).show();

                    }
                });

                //Configurar botao positivo
                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Pressionado botão sim",Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.create();
                dialog.show();

            }
        });
    }
}

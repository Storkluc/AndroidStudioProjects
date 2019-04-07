package atmempresaconsultoria.cursoandroid.com.atmempresa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class atmEmpresaConsultoria extends Activity {

    private ImageView botaoempresa;
    private ImageView botaocontato;
    private ImageView botaoservico;
    private ImageView botaoclientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm_empresa_consultoria);

        botaoempresa = (ImageView) findViewById(R.id.empresaId);
        botaocontato = (ImageView) findViewById(R.id.contatoId);
        botaoservico = (ImageView) findViewById(R.id.servicoId);
        botaoclientes = (ImageView) findViewById(R.id.clienteId);

        botaoempresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(atmEmpresaConsultoria.this, empresaActivity.class));
            }
        });

        botaocontato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(atmEmpresaConsultoria.this, ContatoActivity.class));
            }
        });

        botaoservico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(atmEmpresaConsultoria.this, ServicoActivity.class));
            }
        });

        botaoclientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(atmEmpresaConsultoria.this, ClienteActivity.class));
            }
        });



    }
}

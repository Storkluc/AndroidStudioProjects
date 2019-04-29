package logmath.com.logmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import faseslogmath.com.logmath.ComecarActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoconfig;
    private ImageView botaocomecar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaocomecar = (ImageView)findViewById(R.id.comecarId);
        botaoconfig = (ImageView) findViewById(R.id.configId);

        botaocomecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ComecarActivity.class));
            }
        });

        botaoconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ConfigActivity.class));
            }
        });
    }
}

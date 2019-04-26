package programingandmath.cursoandroid.com.programingandmath;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView botaoPlay;
    private ImageView boatoConfg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoPlay = (ImageView) findViewById(R.id.playId);
        boatoConfg = (ImageView) findViewById(R.id.configId);


        botaoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        boatoConfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ConfigActivity.class));
            }
        });

    }
}

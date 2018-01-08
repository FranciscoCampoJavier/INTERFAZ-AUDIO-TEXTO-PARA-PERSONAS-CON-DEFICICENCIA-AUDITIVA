package oxigensoft.speacktotext;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class Bienvenida extends AppCompatActivity {

    Button btn_1;
    Button btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        btn_1 = (Button) findViewById(R.id.btn_1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent itemintent = new Intent(Bienvenida.this, Texto.class);
               Bienvenida.this.startActivity(itemintent);
                finish();
            }
        });

        btn_2 = (Button) findViewById(R.id.btn_2);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Bienvenida.this, Ayuda.class);
                Bienvenida.this.startActivity(itemintent);
                finish();
            }
        });


    }
}


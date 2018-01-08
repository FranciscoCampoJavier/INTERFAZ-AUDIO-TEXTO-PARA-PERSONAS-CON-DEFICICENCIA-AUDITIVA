package oxigensoft.speacktotext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;


public class Principal extends AppCompatActivity {

    private final int DURACION_SPLASH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad secundaria de la aplicación
                Intent intent = new Intent(Principal.this, Bienvenida.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
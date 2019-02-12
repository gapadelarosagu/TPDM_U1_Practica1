package mx.edu.ittepic.tpdm_u1_practica1_delarosaguerrerogabriela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText nombreM;
    Button boton;
    TextView etiqueta;
    Spinner animales;
    CheckBox robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlazando con xml aqui

        boton = findViewById(R.id.boton);
        nombreM = findViewById(R.id.nombre);
        etiqueta = findViewById(R.id.etiqueta);
        animales = findViewById(R.id.seleccion);
        robot = findViewById(R.id.casilla);


        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               /* String mensaje = "El animal seleccionado es: " + animales.getSelectedItem().toString();
                Toast.makeText(MainActivity.this,mensaje,Toast.LENGTH_LONG).show();*/

                etiqueta.setText("La cita de "+nombreM.getText().toString() + " "+animales.getSelectedItem().toString()+ " es el dia de mañana");

            }
        });
    }

    public void mensajeBoton (View v){
        etiqueta.setText("El animal seleccionado es: " + animales.getSelectedItem().toString());

    }

    public void seleccion(View s){
        String mensaje = "¡Genial no eres un robot! ";
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}

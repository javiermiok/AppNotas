package com.example.a21752434.appnotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etAsignatura;
    private ListadoNotasAlumnos lista;  //Contiene los datos, y se utiliza para consultar las asignaturas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAsignatura = findViewById(R.id.etAsignatura);

        lista = new ListadoNotasAlumnos();
    }

    public void clickConsultar(View v) {

        String asignatura = etAsignatura.getText().toString();

        // Si está el campo vacio
        if(asignatura.isEmpty() || asignatura.trim().equals("")) {
            Toast toast = Toast.makeText(getBaseContext(),
                    getString(R.string.toast_error_vacio),
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0, 0);
            toast.show();

            // Si no hay datos de la asignatura en la LISTA
        } else if(!lista.hayNotasAsig(asignatura)){
            Toast toast = Toast.makeText(getBaseContext(),
                    getString(R.string.toast_error_asignatura),
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0, 0);
            toast.show();
            etAsignatura.setText("");

            // Si tod0 a ido bien pasamos a la siguiente actividad
        } else {
            Intent i = new Intent(this, ActivityListaAlumnos.class);
            //TODO mejor pasar solo asignatura o pasar el array de resultados
            i.putExtra("ASIG",asignatura);
            i.putParcelableArrayListExtra("LISTA_RESULTADO", lista.getListaAlumnosAsig(asignatura));
            startActivity(i);

            finish();
        } // fin if-else

    } // fin clickConsultar()
}

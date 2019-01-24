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
    private ListadoNotasAlumnos lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAsignatura = findViewById(R.id.etAsignatura);

        lista = new ListadoNotasAlumnos();
    }

    public void clickConsultar(View v) {

        String asignatura = etAsignatura.getText().toString();

        if(asignatura.isEmpty() || asignatura.trim().equals("")) {
            // Si está el campo vacio
            Toast toast = Toast.makeText(getBaseContext(),
                    getString(R.string.toast_error_vacio),
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0, 0);
            toast.show();

        } else if(!lista.hayNotasAsig(asignatura)){
            // Si no hay datos de la asignatura en la LISTA
            Toast toast = Toast.makeText(getBaseContext(),
                    getString(R.string.toast_error_asignatura),
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0, 0);
            toast.show();
            etAsignatura.setText("");

        } else {
            // Pasamos a la siguiente actividad
            Intent i = new Intent(this, ActivityListaAlumnos.class);
            i.putExtra("ASIG",asignatura);
            startActivity(i);

            finish();
        } // fin if-else

    } // fin clickConsultar()
}

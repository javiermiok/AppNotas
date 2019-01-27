package com.example.a21752434.appnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.a21752434.appnotas.javaBean.AlumnoAsig;

public class PantallaNotasAlumno extends AppCompatActivity {

    private TextView tvAsignaturaPantalla;
    private TextView tvNombrePantalla;
    private TextView tvTareaPantalla;
    private TextView tvExamenPantalla;
    private TextView tvActitudPantalla;
    private TextView tvNotaFinalPantalla;

    private AlumnoAsig datosAlumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_notas_alumno);

        tvAsignaturaPantalla = findViewById(R.id.tvAsignaturaPantalla);
        tvNombrePantalla = findViewById(R.id.tvAlumnoPantalla);
        tvTareaPantalla = findViewById(R.id.tvTareaPantalla);
        tvExamenPantalla = findViewById(R.id.tvExamenPantalla);
        tvActitudPantalla = findViewById(R.id.tvActitudPantalla);
        tvNotaFinalPantalla = findViewById(R.id.tvNotaFinalPantalla);

        datosAlumno = getIntent().getParcelableExtra("SELECCION");

        tvAsignaturaPantalla.setText(datosAlumno.getAsignatura());
        tvNombrePantalla.setText(datosAlumno.getNombre());
        tvTareaPantalla.setText(String.format(getString(R.string.tv_nota_tareas),datosAlumno.getNotaTarea()));
        tvExamenPantalla.setText(String.format(getString(R.string.tv_nota_tareas),datosAlumno.getNotaExamen()));
        tvActitudPantalla.setText(String.format(getString(R.string.tv_nota_tareas),datosAlumno.getNotaActitud()));

    }

    public void calcualr(View v) {
        double notaFinal = 0;
        double notaExamen = datosAlumno.getNotaExamen();
        double notaTarea = datosAlumno.getNotaTarea();
        double notaActitud = datosAlumno.getNotaActitud();

        if(notaExamen >= 4 && notaTarea >= 5) {
            notaFinal = notaTarea*0.6 + notaExamen*0.3 + notaActitud*0.1;

        } else if (notaExamen < 4){
            notaFinal = notaExamen;

        } else if(notaTarea < 5) {
            notaFinal = notaTarea*0.6 + notaExamen*0.3;
        }

        tvNotaFinalPantalla.setText(String.format(getString(R.string.tv_nota_final),notaFinal));
        tvNotaFinalPantalla.setVisibility(View.VISIBLE);
    }
}

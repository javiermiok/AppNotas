package com.example.a21752434.appnotas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.a21752434.appnotas.javaBean.AlumnoAsig;

import java.util.ArrayList;

public class ActivityListaAlumnos extends AppCompatActivity {

    //Nuevo
    private RecyclerView recycleV;
    private LinearLayoutManager layoutM;
    private AdaptadorNotas adapterN;
    private ArrayList<AlumnoAsig> listaResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alumnos);

        //Nuevo
        recycleV = findViewById(R.id.rvListaAlumnos);
        recycleV.setHasFixedSize(true);

        layoutM = new LinearLayoutManager(this);
        recycleV.setLayoutManager(layoutM);

        //TODO esta opción es mejor?
        listaResultado = getIntent().<AlumnoAsig>getParcelableArrayListExtra("LISTA_RESULTADO");
        adapterN = new AdaptadorNotas(listaResultado, getApplicationContext());
        adapterN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Seleccionada la opción " + recycleV.getChildAdapterPosition(v) ;
                Toast.makeText(ActivityListaAlumnos.this,msg,Toast.LENGTH_SHORT).show();

                //Pasar a la ventana PantallaNotasALumno
                Intent i = new Intent(ActivityListaAlumnos.this, PantallaNotasAlumno.class);
                i.putExtra("SELECCION", listaResultado.get(recycleV.getChildAdapterPosition(v)));
                startActivity(i);
            }
        });
        recycleV.setAdapter(adapterN);
    }

    /**
     * Cargamos el menu creado
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menuInicio) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);


        } else if (item.getItemId() == R.id.menuSalir) {
            crearDialogo().show();
        }

        return true;
    }

    private Dialog crearDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ActivityListaAlumnos.this);
        //builder.setCancelable(false);
        builder.setMessage(R.string.dialgo_mensaje);

        builder.setPositiveButton(R.string.dialog_permanecer, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.setNegativeButton(R.string.dialog_salir, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        return builder.create();
    } // fin crearDialogo()
}

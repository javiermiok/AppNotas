package com.example.a21752434.appnotas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a21752434.appnotas.javaBean.AlumnoAsig;

import java.util.ArrayList;

public class AdaptadorNotas extends RecyclerView.Adapter<AdaptadorNotas.NotasViewHolder>
        implements View.OnClickListener  {

    private ArrayList<AlumnoAsig> datos;
    //Nuevo
    private View.OnClickListener listener;
    private Context context;

    //TODO Añadir contexto como parámetro
    public AdaptadorNotas(ArrayList<AlumnoAsig> datos, Context context) {
        this.datos = datos;
        this.context = context;
    }

    @NonNull
    @Override
    public NotasViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alumno_item, viewGroup,false);
        v.setOnClickListener(this);
        NotasViewHolder nvh = new NotasViewHolder(v,context);
        return nvh;
    }

    @Override
    public void onBindViewHolder(@NonNull NotasViewHolder notasViewHolder, int i) {
        notasViewHolder.bindPatron(datos.get(i));
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    @Override
    public void onClick(View v) {
        if(listener != null) {
            listener.onClick(v);
        }
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    /*--------------------               CLASE INTERNA               -----------------------------*/

    public static class NotasViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombre;
        private TextView tvNotaExamen;
        private TextView tvNotaTareas;
        private TextView tvNotaActitud;
        private Context context;

        public NotasViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.context = context;
            tvNombre = itemView.findViewById(R.id.tvNombreAl);
            tvNotaExamen = itemView.findViewById(R.id.tvNotaExamen);
            tvNotaTareas = itemView.findViewById(R.id.tvNotaTareas);
            tvNotaActitud = itemView.findViewById(R.id.tvNotaActitud);
        }

        //TODO getString(String.format());...
        public void bindPatron(AlumnoAsig alum) {
            tvNombre.setText(alum.getNombre());
            tvNotaExamen.setText(String.format(context.getString(R.string.tv_nota_examen),alum.getNotaExamen()));
            tvNotaTareas.setText(String.format(context.getString(R.string.tv_nota_tareas),alum.getNotaTarea()));
            tvNotaActitud.setText(String.format(context.getString(R.string.tv_nota_actitud),alum.getNotaActitud()));
        }
    }

}

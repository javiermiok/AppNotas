package com.example.a21752434.appnotas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a21752434.appnotas.javaBean.AlumnoAsig;

import java.util.ArrayList;

public class AdaptadorNotas extends RecyclerView.Adapter<AdaptadorNotas.NotasViewHolder> {

    private ArrayList<AlumnoAsig> datos;

    public AdaptadorNotas(ArrayList<AlumnoAsig> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public NotasViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alumno_item, viewGroup,false);
        NotasViewHolder nvh = new NotasViewHolder(v);
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

    public static class NotasViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombre;
        private TextView tvNotaExamen;
        private TextView tvNotaTareas;
        private TextView tvNotaActitud;

        public NotasViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombreAl);
            tvNotaExamen = itemView.findViewById(R.id.tvNotaExamen);
            tvNotaTareas = itemView.findViewById(R.id.tvNotaTareas);
            tvNotaActitud = itemView.findViewById(R.id.tvNotaActitud);
        }

        public void bindPatron(AlumnoAsig alum) {
            tvNombre.setText(alum.getNombre());
            tvNotaExamen.setText(String.valueOf(alum.getNotaExamen()));
            tvNotaTareas.setText(String.valueOf(alum.getNotaTarea()));
            tvNotaActitud.setText(String.valueOf(alum.getNotaActitud()));
        }
    }
}

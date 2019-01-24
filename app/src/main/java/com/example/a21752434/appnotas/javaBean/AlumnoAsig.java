package com.example.a21752434.appnotas.javaBean;

import android.os.Parcel;
import android.os.Parcelable;

public class AlumnoAsig implements Parcelable{

    private String nombre;
    private String asignatura;
    private double notaTarea;
    private double notaExamen;
    private double notaActitud;

    /*----------------------------------------CONSTUCTOR------------------------------------------*/
    public AlumnoAsig(String nombre, String asignatura, double notaTarea, double notaExamen, double notaActitud) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.notaTarea = notaTarea;
        this.notaExamen = notaExamen;
        this.notaActitud = notaActitud;
    }

    /*------------------------------------GETTERS/SETTERS-----------------------------------------*/
    public String getAsignatura() {
        return asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaTarea() {
        return notaTarea;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public double getNotaActitud() {
        return notaActitud;
    }

    protected AlumnoAsig(Parcel in) {
        nombre = in.readString();
        asignatura = in.readString();
        notaTarea = in.readDouble();
        notaExamen = in.readDouble();
        notaActitud = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(asignatura);
        dest.writeDouble(notaTarea);
        dest.writeDouble(notaExamen);
        dest.writeDouble(notaActitud);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AlumnoAsig> CREATOR = new Creator<AlumnoAsig>() {
        @Override
        public AlumnoAsig createFromParcel(Parcel in) {
            return new AlumnoAsig(in);
        }

        @Override
        public AlumnoAsig[] newArray(int size) {
            return new AlumnoAsig[size];
        }
    };
}

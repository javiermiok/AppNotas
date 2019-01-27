package com.example.a21752434.appnotas;

import com.example.a21752434.appnotas.javaBean.AlumnoAsig;

import java.util.ArrayList;

public class ListadoNotasAlumnos {

    private ArrayList<AlumnoAsig> lista;

    public ListadoNotasAlumnos() {
        lista = new ArrayList<AlumnoAsig>();
        cargarDatos();
    }

    public ArrayList<AlumnoAsig> getListaAlumnosAsig(String asignatura) {
        ArrayList<AlumnoAsig> resultados = new ArrayList<AlumnoAsig>();

        for (AlumnoAsig alumno: lista) {
            if(alumno.getAsignatura().toLowerCase().contains(asignatura.toLowerCase())) { // Si el alumno tienen la asignatura
                resultados.add(alumno);                       // Se añade al resultado
            }
        }

        return resultados;
    }

    public boolean hayNotasAsig(String asignatura) {

        for(AlumnoAsig alumno: lista) {
            if (alumno.getAsignatura().toLowerCase().contains(asignatura.toLowerCase())) {
                return true;
            }
        }

        return false;
    }

    private void cargarDatos() {
        lista.add(new AlumnoAsig("García Sanz Gema", "SGE (Sistemas de Gestión Empresarial)", 6.50, 9.50, 9.30));
        lista.add(new AlumnoAsig("García Sanz Gema", "PSP (Programación de Servicios y Procesos)", 9.70, 9.40, 8.65));
        lista.add(new AlumnoAsig("García Sanz Gema", "AD (Acceso a Datos)", 9.20, 8.90, 6.40));
        lista.add(new AlumnoAsig("García Sanz Gema", "PMDM (Programación Multimedia y Dispositivos Móviles)", 7.50, 9.00, 9.30));
        lista.add(new AlumnoAsig("Segovia Martín Álvaro", "SGE (Sistemas de Gestión Empresarial)", 9.40, 8.10, 7.00));
        lista.add(new AlumnoAsig("Segovia Martín Álvaro", "PSP (Programación de Servicios y Procesos)", 10.00, 8.10, 7.00));
        lista.add(new AlumnoAsig("Segovia Martín Álvaro", "AD (Acceso a Datos)", 9.90, 9.70, 9.60));
        lista.add(new AlumnoAsig("Segovia Martín Álvaro", "PMDM (Programación Multimedia y Dispositivos Móviles)", 9.50, 8.90, 7.25));
        lista.add(new AlumnoAsig("Gómez Reverte Alfonso", "SGE (Sistemas de Gestión Empresarial)", 4.50, 9.30, 9.15));
        lista.add(new AlumnoAsig("Gómez Reverte Alfonso", "PSP (Programación de Servicios y Procesos)", 9.80, 3.10, 7.00));
        lista.add(new AlumnoAsig("Gómez Reverte Alfonso", "AD (Acceso a Datos)", 9.50, 8.90, 7.25));
        lista.add(new AlumnoAsig("Gómez Reverte Alfonso", "PMDM (Programación Multimedia y Dispositivos Móviles)", 9.80, 8.10, 7.00));
        lista.add(new AlumnoAsig("Muñoz Ríos Alejandro", "SGE (Sistemas de Gestión Empresarial)", 7.50, 3.30, 9.15));
        lista.add(new AlumnoAsig("Muñoz Ríos Alejandro", "PSP (Programación de Servicios y Procesos)", 9.50, 8.90, 7.25));
        lista.add(new AlumnoAsig("Muñoz Ríos Alejandro", "AD (Acceso a Datos)", 7.50, 9.30, 9.15));
        lista.add(new AlumnoAsig("Muñoz Ríos Alejandro", "PMDM (Programación Multimedia y Dispositivos Móviles)", 9.70, 9.60, 9.15));
        lista.add(new AlumnoAsig("Sánchez Flores Sergio", "SGE (Sistemas de Gestión Empresarial)", 7.50, 9.30, 9.15));
        lista.add(new AlumnoAsig("Sánchez Flores Sergio", "PSP (Programación de Servicios y Procesos)", 9.50, 8.90, 7.25));
        lista.add(new AlumnoAsig("Sánchez Flores Sergio", "AD (Acceso a Datos)", 9.70, 3.60, 9.15));
        lista.add(new AlumnoAsig("Sánchez Flores Sergio", "PMDM (Programación Multimedia y Dispositivos Móviles)", 5.00, 9.30, 6.40));
        lista.add(new AlumnoAsig("Martinez Herrero Sofía", "SGE (Sistemas de Gestión Empresarial)", 7.50, 9.30, 9.15));
        lista.add(new AlumnoAsig("Martinez Herrero Sofía", "PSP (Programación de Servicios y Procesos)", 7.50, 9.30, 9.15));
        lista.add(new AlumnoAsig("Martinez Herrero Sofía", "AD (Acceso a Datos)", 5.00, 9.30, 6.40));
        lista.add(new AlumnoAsig("Martinez Herrero Sofía", "PMDM (Programación Multimedia y Dispositivos Móviles)", 9.80, 8.10, 7.00));
        lista.add(new AlumnoAsig("Fernández Alba Jaime", "SGE (Sistemas de Gestión Empresarial)", 5.00, 9.30, 6.40));
        lista.add(new AlumnoAsig("Fernández Alba Jaime", "PSP (Programación de Servicios y Procesos)", 8.00, 9.70, 9.40));
        lista.add(new AlumnoAsig("Fernández Alba Jaime", "AD (Acceso a Datos)", 9.20, 8.90, 6.40));
        lista.add(new AlumnoAsig("Fernández Alba Jaime", "PMDM (Programación Multimedia y Dispositivos Móviles)", 9.20, 8.90, 6.40));
        lista.add(new AlumnoAsig("Pérez Camas Santiago", "SGE (Sistemas de Gestión Empresarial)", 7.50, 9.30, 9.15));
        lista.add(new AlumnoAsig("Pérez Camas Santiago", "PSP (Programación de Servicios y Procesos)", 9.70, 9.60, 9.15));
        lista.add(new AlumnoAsig("Pérez Camas Santiago", "AD (Acceso a Datos)", 4.00, 7.30, 6.40));
        lista.add(new AlumnoAsig("Pérez Camas Santiago", "PMDM (Programación Multimedia y Dispositivos Móviles)", 9.20, 8.90, 6.40));
        lista.add(new AlumnoAsig("Tomé Roca Álvaro", "SGE (Sistemas de Gestión Empresarial)", 9.70, 9.60, 9.15));
        lista.add(new AlumnoAsig("Tomé Roca Álvaro", "PSP (Programación de Servicios y Procesos)", 7.50, 9.30, 9.15));
        lista.add(new AlumnoAsig("Tomé Roca Álvaro", "AD (Acceso a Datos)", 9.80, 8.10, 7.00));
        lista.add(new AlumnoAsig("Tomé Roca Álvaro", "PMDM (Programación Multimedia y Dispositivos Móviles)", 9.20, 8.90, 6.40));
        lista.add(new AlumnoAsig("Díaz Rodriguez Ana", "SGE (Sistemas de Gestión Empresarial)", 9.80, 8.10, 7.00));
        lista.add(new AlumnoAsig("Díaz Rodriguez Ana", "PSP (Programación de Servicios y Procesos)", 3.00, 5.30, 6.40));
        lista.add(new AlumnoAsig("Díaz Rodriguez Ana", "AD (Acceso a Datos)", 9.70, 9.60, 9.15));
        lista.add(new AlumnoAsig("Díaz Rodriguez Ana", "PMDM (Programación Multimedia y Dispositivos Móviles)", 7.50, 9.30, 9.15));
        lista.add(new AlumnoAsig("Esteban Correal Ángela", "SGE (Sistemas de Gestión Empresarial)", 5.00, 9.30, 6.40));
        lista.add(new AlumnoAsig("Esteban Correal Ángela", "PSP (Programación de Servicios y Procesos)", 9.20, 8.90, 6.40));
        lista.add(new AlumnoAsig("Esteban Correal Ángela", "AD (Acceso a Datos)", 9.80, 8.10, 7.00));
        lista.add(new AlumnoAsig("Esteban Correal Ángela", "PMDM (Programación Multimedia y Dispositivos Móviles)", 4.70, 9.60, 9.15));
        lista.add(new AlumnoAsig("Sanz Hurtado Javier", "SGE (Sistemas de Gestión Empresarial)", 5.00, 9.30, 6.40));
        lista.add(new AlumnoAsig("Sanz Hurtado Javier", "PSP (Programación de Servicios y Procesos)", 9.20, 8.90, 6.40));
        lista.add(new AlumnoAsig("Sanz Hurtado Javier", "AD (Acceso a Datos)", 9.80, 8.10, 7.00));
        lista.add(new AlumnoAsig("Sanz Hurtado Javier", "PMDM (Programación Multimedia y Dispositivos Móviles)", 9.70, 8.70, 6.70));

    }
}

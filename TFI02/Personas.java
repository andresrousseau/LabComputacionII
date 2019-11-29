package TFI02;

import java.util.Scanner;

public abstract class Personas {
    private String nombre;
    private String apellido;
    private int legajo;



    public void modificarDatos(String nombre, String apellido, int legajo){

        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}

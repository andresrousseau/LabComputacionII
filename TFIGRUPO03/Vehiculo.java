package TFIGRUPO03;

import java.util.Scanner;

public class Vehiculo {
    private String marca;
    private double precio;
    private String patente;
    private String modelo;

    public Vehiculo(){
        marca = "fiat";
        precio = 0;

        modelo = "siena";
    }

        public Vehiculo(String marca ,String modelo,double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    public Vehiculo(String marca ,String modelo,String patente,double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.precio = precio;


    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}



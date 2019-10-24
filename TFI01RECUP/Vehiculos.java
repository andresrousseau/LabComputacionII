package TFI01RECUP;

import TFI01.Espectadores;

public class Vehiculos extends Automovil{

    private String origen;
    private String destino;
    private String chofer;
    private Pasajeros [] pasajeros;
    private String matricula;
    private int capacidad;

    public Vehiculos(String origen, String destino, String chofer, Pasajeros[] pasajeros, String matricula, int capacidad) {
        this.origen = origen;
        this.destino = destino;
        this.chofer = chofer;
        this.pasajeros = pasajeros;
        this.matricula = matricula;
        this.capacidad = capacidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return null;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }
    public void setPasajeros(Pasajeros[] pasajeros) {
        if (pasajeros.length > this.capacidad){
            System.out.println("LA LISTA DE PASAJEROS ES SUPERIOR A LA CAPACIDAD DEL VEHÍCULO");
        }else {
            this.pasajeros = pasajeros;
        }


    }

    public String getPasajeros() {
        try {
            String listaPasajeros = "Lista de Pasajeros: \n";
            for(Pasajeros pasajero : this.pasajeros){
                listaPasajeros = listaPasajeros + pasajero.toString();
            }
            return listaPasajeros;
        }catch (Exception e){
            return "Sin pasajeros cargados";
        }
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

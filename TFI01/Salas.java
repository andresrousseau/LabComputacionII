package TFI01;

public class Salas {

    private int capacidad;
    private String pelucula;
    private String nombreSala;
    private String [] listadoEspectadores;

    public Salas(int capacidad, String nombreSala){

        this.capacidad = capacidad;
        this.nombreSala = nombreSala;

    }

    @Override
    public String toString() {
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelucula='" + pelucula + '\'' +
                ", nombreSala='" + nombreSala + '\'' +
                ", listadoEspectadores='" + listadoEspectadores + '\'' +
                '}';
    }



    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPelucula() {
        return pelucula;
    }

    public void setPelucula(String pelucula) {
        this.pelucula = pelucula;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;

    }

    public String[] getListadoEspectadores() {
        return listadoEspectadores;
    }

    public void setListadoEspectadores(String [] listadoEspectadores) {

        this.listadoEspectadores = listadoEspectadores;
    }
}

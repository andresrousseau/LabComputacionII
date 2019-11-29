package TFI02;

import java.util.Iterator;
import java.util.Set;

public class Facultad implements Informacion{
    private String nombre;
    private Set<Carreras> coleccionDeCarreras;



    public Facultad(Set<Carreras> coleccionDeCarreras){
        this.setColeccionDeCarreras(coleccionDeCarreras);
    }
    public void cargarCarrera(Carreras carrera){

        getColeccionDeCarreras().add(carrera);

        System.out.println(carrera.toString());

    }
    public void eliminarCarrera(String nombre) {

        Iterator<Carreras> iterador = getColeccionDeCarreras().iterator();

        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + " fue eliminada.");
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Carreras> getColeccionDeCarreras() {
        return coleccionDeCarreras;
    }

    public void setColeccionDeCarreras(Set<Carreras> coleccionDeCarreras) {
        this.coleccionDeCarreras = coleccionDeCarreras;
    }
    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionDeCarreras=" + coleccionDeCarreras +
                '}';
    }
}

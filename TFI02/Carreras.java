package TFI02;

import java.util.Iterator;
import java.util.Set;

public class Carreras {
    private String nombre;
    private Set<Materias> coleccionDeMaterias;



    public Carreras(Set<Materias> coleccionDeMaterias){
        this.setColeccionDeMaterias(coleccionDeMaterias);
    }

    public void cargarMateria(Materias materia){

        getColeccionDeMaterias().add(materia);

        System.out.println(materia.toString());

    }

    public void eliminarMateria(String nombre) {

        Iterator<Materias> iterador = getColeccionDeMaterias().iterator();

        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + " fue eliminada.");
            }
        }
    }
    public void buscarMateria(String nombre) {

        for (Materias materia : coleccionDeMaterias) {
            if(materia.getNombre().equals(nombre)) {
                System.out.println(materia.toString() + " fue encontrado.");
            }
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materias> getColeccionDeMaterias() {
        return coleccionDeMaterias;
    }

    public void setColeccionDeMaterias(Set<Materias> coleccionDeMaterias) {
        this.coleccionDeMaterias = coleccionDeMaterias;
    }
    @Override
    public String toString() {
        return "Carreras{" +
                "nombre='" + nombre + '\'' +
                ", coleccionDeMaterias=" + coleccionDeMaterias +
                '}';
    }
}

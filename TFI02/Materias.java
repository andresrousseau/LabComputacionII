package TFI02;



import java.util.Iterator;
import java.util.Set;

public class Materias implements Informacion{
    private String nombre;
    private String profesor;
    private Set<Estudiantes> coleccionDeEstudiantes;

    public Materias(Set<Estudiantes> coleccionDeEstudiantes){
        this.setColeccionDeEstudiantes(coleccionDeEstudiantes);
    }
    public void cargarEstudiante(Estudiantes estudiante){

        getColeccionDeEstudiantes().add(estudiante);

        System.out.println(estudiante.toString());

    }
    public void eliminarEstudiante(String nombre) {

        Iterator<Estudiantes> iterador = getColeccionDeEstudiantes().iterator();

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

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Set<Estudiantes> getColeccionDeEstudiantes() {
        return coleccionDeEstudiantes;
    }

    public void setColeccionDeEstudiantes(Set<Estudiantes> coleccionDeEstudiantes) {
        this.coleccionDeEstudiantes = coleccionDeEstudiantes;
    }

    @Override
    public String toString() {
        return "Materias{" +
                "nombre='" + nombre + '\'' +
                ", profesor='" + profesor + '\'' +
                ", coleccionDeEstudiantes=" + coleccionDeEstudiantes +
                '}';
    }
}

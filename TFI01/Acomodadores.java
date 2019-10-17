package TFI01;

public class Acomodadores extends Empleados implements ParaAcomodadores {

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String sala() {
        return null;
    }
}

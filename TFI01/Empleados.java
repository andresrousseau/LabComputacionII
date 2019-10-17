package TFI01;

public class Empleados extends Personas{

    private double sueldoPersona;

    public Empleados(String nombre, int edad){

    }


    @Override
    public String tipoPersona() {
        return null;
    }

    @Override
    public String datosPersona() {
        return null;
    }

    public double getSueldoPersona() {
        return sueldoPersona;
    }

    public void setSueldoPersona(double sueldoPersona) {
        this.sueldoPersona = sueldoPersona;
    }
}

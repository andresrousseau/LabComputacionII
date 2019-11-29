package TFI02;

public class Profesores extends Personas {
    private double sueldoBasico;
    private int antiguedad;

    public void CalcularSueldo(double sueldoBasico, int antiguedad){


    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "sueldoBasico=" + sueldoBasico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}

package TrabajoPracticoN9.Ejercicio01;

public class Naturales extends Numeros implements ParaNumeros {


    private double a;

    public Naturales(double a) {
        this.a = a;
    }

    @Override
    public void sumar(Numeros nro) {

    }

    @Override
    public void restar(Numeros nro) {

    }

    @Override
    public String getValor() {
        return "Valor: " + this.a;
    }
}

package TrabajoPracticoN9.Ejercicio01;

public class Complejos extends Numeros implements ParaNumeros {


    private double a;
    private double b;

    public Complejos(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void sumar(Numeros nro) {

    }

    @Override
    public void restar(Numeros nro) {

    }

    @Override
    public String getValor() {
        return "Valor: ("+this.a+","+this.b+")";
    }
}

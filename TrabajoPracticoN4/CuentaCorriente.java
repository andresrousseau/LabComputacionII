package TrabajoPracticoN4;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(String nombreTitular, double saldo){
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = (long) (Math.random()*100);
    }

    public void setIngreso(double ingreso){
        this.saldo = this.saldo + ingreso;
    }

    public void setReintegro(double monto){
        this.saldo = this.saldo - monto;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getDatos(){
        return "\n NOMBRE TITULAR: "+this.nombreTitular
                +"\n SALDO: "+this.saldo
                +"\n NRO. CUENTA: "+this.numeroCuenta;
    }
}

package TrabajoEnClase5;

import java.util.Scanner;

public class CuentaCorriente {
    private String nombreTitular;
    private double saldoInicial;
    private int numeroCuentaCorriente;

    public CuentaCorriente(String nombreTitular, double saldoInicial, int numeroCuentaCorriente){
        this.nombreTitular = nombreTitular;
        this.saldoInicial = saldoInicial;
        this.numeroCuentaCorriente = numeroCuentaCorriente;
    }

    public CuentaCorriente(){
        this.nombreTitular = null;
        this.saldoInicial = 0;
        this.numeroCuentaCorriente = 0;
    }

    public String verInfo(){
        return ("\n----INFORMACION DE CUENTA---------\n"
                +" Nombre: " + this.nombreTitular+"\n"
                +" Nro. Cuenta: " + Double.toString(this.numeroCuentaCorriente)+ "\n"
                +" Saldo: $" + this.saldoInicial+"\n");


    }


    public void depositar(double monto){
        this.saldoInicial = this.saldoInicial + monto;
    }

    public void extraer(double monto){
        this.saldoInicial = this.saldoInicial - monto;
    }

    public String verSaldo(){
        return "$ "+ Double.toString(this.saldoInicial);
    }

    public long verNumeroCuenta(){
        return this.numeroCuentaCorriente;
    }

    public static void Transferir(CuentaCorriente origen,CuentaCorriente destino, double monto){
        destino.depositar(monto);
        origen.extraer(monto);
    }

    public static void ListarCuentas(CuentaCorriente[] cuentas){
        for (CuentaCorriente cuenta : cuentas){
            System.out.print(cuenta.verInfo());
        }
    }

    public static void CargarCuentas(CuentaCorriente[] cuentas){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <cuentas.length ; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.next();

            System.out.print("Saldo Inicial: ");
            double saldo = sc.nextDouble();

            System.out.print("Nro. Cuenta: ");
            int nroCuenta = sc.nextInt();

            System.out.print("\n-------------------\n");

            CuentaCorriente cuenta = new CuentaCorriente(nombre, saldo, nroCuenta);
            cuentas[i] = cuenta;
        }
    }

    public static CuentaCorriente BuscarCuenta(CuentaCorriente[] cuentas, int nroCuenta){
        CuentaCorriente cuentaSalida = new CuentaCorriente();

        for (CuentaCorriente cuenta : cuentas) {
            if (cuenta.verNumeroCuenta() == nroCuenta){
                cuentaSalida = cuenta;
                break;
            }

        }
        return cuentaSalida;
    }
}

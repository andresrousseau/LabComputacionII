package TrabajoPracticoN4;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Pedro", 500);
        CuentaCorriente cuenta2 = new CuentaCorriente("Tomas", 400);

        cuenta1.setIngreso(150);
        cuenta2.setIngreso(300);

        System.out.println(cuenta1.getDatos());
        System.out.println(cuenta2.getDatos());
    }
}

package TrabajoPracticoN7;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        pedirDatos();
    }
    static void pedirDatos() throws FueraDeRango{

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero ente 0 a 100: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 100){
            FueraDeRango miExcepcion = new FueraDeRango ("El numero esta fuera de rango");
            throw miExcepcion;
        }else {
            System.out.println("El Numero ingresado es "+numero);
        }
        sc.close();
    }
}
class FueraDeRango extends RuntimeException{
    public FueraDeRango(){

    }

    public FueraDeRango(String mensajeError){

        super(mensajeError);
    }
}

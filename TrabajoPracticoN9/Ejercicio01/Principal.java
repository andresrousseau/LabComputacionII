package TrabajoPracticoN9.Ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int cant = pedirTamañoArray();
        Numeros[] numeros = new Numeros[cant];
        //System.out.println(numeros.length);

        for (int i = 0; i < numeros.length; i++) {

        }
    }

    public static int pedirTamañoArray(){
        Scanner entrada = new Scanner(System.in);

        int cant=0;
        System.out.println("Ingrese el tamaño del array");
        try {
            cant = entrada.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ingrese un numero natural");
            cant = pedirTamañoArray();
        }
        return cant;
    }

    public static void crearNumeros(Numeros[] nro){
        Scanner entrada = new Scanner(System.in);

        System.out.println("elija el tipo de numero:    1>Natural 2>Complejo");
        try {
            int op = entrada.nextInt();

            for (int i = 0; i < nro.length; i++) {
                switch (op){
                    case 1:
                        System.out.println("Ingrese un numero");
                        double a = entrada.nextDouble();
                        nro[i] = new Naturales(a);
                        break;
                    case 2:
                        System.out.println("Ingrese el numero real");
                        a = entrada.nextDouble();
                        System.out.println("Ingrese el numero imaginario");
                        double b = entrada.nextDouble();
                        nro[i] = new Complejos(a,b);
                        break;
                    default:
                        System.out.println("<opcion erronea>");
                        i--;
                        break;
                }
            }

        }catch (InputMismatchException e){

        }

    }
}

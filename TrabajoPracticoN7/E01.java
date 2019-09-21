package TrabajoPracticoN7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduzca un numero: ");

        try {
            numero = sc.nextInt();

            if (numero % 2 == 0){
                System.out.println("El numero ingresado es Par..");

            }else {
                System.out.println("El numero ingresado es Impar..");
            }
        } catch ( InputMismatchException e) {
            System.out.print("Error: No ha ingresado un numero..");
        }
    }
}

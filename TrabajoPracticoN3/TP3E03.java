package TrabajoPracticoN3;

import java.util.Scanner;

public class TP3E03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [][] datosPersonas = new String[3][3];


        for (int i = 0; i < datosPersonas.length ; i++) {

            System.out.println("Ingrese nombre: ");
            datosPersonas[i][0] = sc.next();

            System.out.println("Ingrese DNI: ");
            datosPersonas[i][1] = sc.next();

            System.out.println("Ingrese edad: ");
            datosPersonas[i][2] = sc.next();
        }

        for (String columna[] : datosPersonas){

            System.out.println("Nombre: "+columna[0]);

            System.out.println("DNI: "+columna[1]);

            System.out.println("Edad: "+columna[2]);
        }

    }
}

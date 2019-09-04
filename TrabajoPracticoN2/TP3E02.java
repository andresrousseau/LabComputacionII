package TrabajoPracticoN2;

import java.util.Scanner;

public class TP3E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arrNumeros = new int [10];
        int media = 0;
        int pares = 0;

        for (int i = 0; i <arrNumeros.length ; i++) {
            System.out.println("Ingres 10 numeros enteros: ");
            arrNumeros [i] = sc.nextInt();

        }
        for (int i = 0; i < arrNumeros.length; i++) {
            if (i%2 == 0 && i != 0){
                pares++;
                media = media + arrNumeros[i];
            }
        }
        System.out.println("La media de las posiciones pares son: "+media/pares);
    }
}

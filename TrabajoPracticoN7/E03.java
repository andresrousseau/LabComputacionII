package TrabajoPracticoN7;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args){

        int continuar = 0;

        while (continuar != 1){

            System.out.println("Ingrese un numero: ");
            Scanner sc = new Scanner(System.in);

            try {
                int numero = sc.nextInt();
                if(numero % 2 == 0){
                    System.out.println("El numero es par..");
                }else {
                    System.out.println("El numero es impar..");
                }
                        continuar = 1;
                System.out.println("\n Fin del programa..");
            }catch (Exception e){
                System.out.println("Error: ");
            }

            System.out.println("\n ------------------------ \n");
        }

    }
}

package TrabajoPracticoN6;

import java.util.Scanner;

public class Principal {

    private static Scanner sc;

    public static void main (String [] args){

        sc = new Scanner(System.in);

        int cantidad, longitud;

        System.out.println("Cantidad de contrasenias: ");
        cantidad = sc.nextInt();

        System.out.println("Longitud de las contrasenias: ");
        longitud = sc.nextInt();

        Passwords passwords = new Passwords(cantidad, longitud);

        System.out.println("Contrasenias");

        for (int i = 0; i < passwords.getPasswards().length ; i++) {

            System.out.print(passwords.getPasswards()[i]);
            System.out.print("--->");

            if (passwords.analizarSeguridad(passwords.getPasswards()[i]) == 1){
                System.out.print("Fuerte");
            }else{
                System.out.print("Debil");
            }
            System.out.println(" ");

        }
    }
}

package TFI01RECUP;

import java.util.Scanner;

public class Viajes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cantidadPasajeros;

        System.out.println("Ingrese la cantidad de pasajeros: ");
        cantidadPasajeros = sc.nextInt();

        Pasajeros [] pasajeros = new Pasajeros[cantidadPasajeros];

        for (int i = 0; i <pasajeros.length -1 ; i++) {

            try {

                Choferes chofer01 = new Choferes("Carlos",33443554);

                pasajeros [i] = new Pasajeros("Juan",34332343);

                Vehiculos vehiculo01 = new Vehiculos("Resistencia","Cordoba","Carlos",null,"fff333",6);

                vehiculo01.setChofer(chofer01);
                vehiculo01.setListaPasajeros(pasajeros);


                System.out.println(vehiculo01);



            }catch (Exception e){
                System.out.println("Error en el ingreso de datos");
                break;
            }

        }

    }
}

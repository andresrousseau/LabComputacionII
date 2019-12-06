package TFIGRUPO03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Marca fiat = new Marca("fiat");
        Marca forza = new Marca("forza");
        DatosEstaticos.listaMarcas.add(fiat);
        DatosEstaticos.listaMarcas.add(forza);
        Vehiculo v1 = new Vehiculo("fiat","uno",200000);
        Vehiculo v2 = new Vehiculo("fiat","siena",200000);
        Vehiculo v3 = new Vehiculo("forza","R4",500000);
        DatosEstaticos.listaMarcas.get(0).agregar(v1);
        DatosEstaticos.listaMarcas.get(0).agregar(v2);
        DatosEstaticos.listaMarcas.get(1).agregar(v3);

        //  Ventana ventana = new Ventana();
        Scanner scanner = new Scanner(System.in);
        System.out.println("modelo");
        String modelo = scanner.next();
        System.out.println("Marca");
        String marca = scanner.next();
        String marcaNueva = Comparacion.Comparar(marca);

        try {
            System.out.println(" Precio");
            double precio = scanner.nextDouble();
            Vehiculo v = new Vehiculo(marcaNueva,modelo,precio);
            Comparacion.AgregarVehiculo(v);
        }catch (Exception e){
            System.out.println("Error al ingresar datos..");
        }


        Imprimir();
    }
    public static void Imprimir (){
        for (int i = 0;i < DatosEstaticos.listaMarcas.size(); i++){
            for (int j = 0; j < DatosEstaticos.listaMarcas.get(i).vehiculos.size();j++){
                System.out.print(DatosEstaticos.listaMarcas.get(i).getNombre());
                System.out.print(" | ");
                System.out.println(DatosEstaticos.listaMarcas.get(i).vehiculos.get(j).getModelo());
            }
        }
    }

}

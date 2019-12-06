package TFIGRUPO03;

import java.util.Scanner;

public class Comparacion {


    static public void AgregarVehiculo(Vehiculo vehiculo){
        String marcaNueva = vehiculo.getMarca();
        int length = DatosEstaticos.listaMarcas.size();
        int cont = 0;
        for (int i = 0; i < length; i++){
            if(DatosEstaticos.listaMarcas.get(i).getNombre().equalsIgnoreCase(marcaNueva)){
                DatosEstaticos.listaMarcas.get(i).agregar(vehiculo);
            }
        }
    }
    static public String Comparar(String marca){
        String marcaNueva = "";
        int length = DatosEstaticos.listaMarcas.size();
        int cont = 0;
        for (int i = 0; i < length; i++){
            if(DatosEstaticos.listaMarcas.get(i).getNombre().equalsIgnoreCase(marca)){
                marcaNueva = marca;
                cont++;
            }
        }
        if(cont == 0){
            marcaNueva =  CrearMarca(marca);
        }
        return marcaNueva;
    }
    static String CrearMarca(String marca){
        System.out.println("desea crear una nueva marca?");
        System.out.println("S/N");
        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.next();

        if(opcion.equalsIgnoreCase("S")){
            System.out.println("Desea Dejar el nombre " + marca + "?   " + "S/N" );
            opcion = teclado.next();
            if(opcion.equalsIgnoreCase("S")){
                Marca nuevaMarca = new Marca(marca);
                DatosEstaticos.listaMarcas.add(nuevaMarca);
                return marca;
            }else {
                System.out.println("nombre de la nueva marca:");
                opcion = teclado.next();
                Marca nuevaMarca = new Marca(opcion);
                DatosEstaticos.listaMarcas.add(nuevaMarca);
                return opcion;
            }
        }
        return marca;
    }
}

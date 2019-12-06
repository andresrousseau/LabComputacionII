package TrabajoPracticoN9.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ComplejoDeportivo[] complejos = new ComplejoDeportivo[3];

        complejos[0] = new ComplejoDeportivo("Municipal","Sala Cubierta",2,2,"Voley",500);
        complejos[1] = new ComplejoDeportivo("Bicentenario","Aire Libre",2,6,"Futbol 5",240);
        complejos[2] = new ComplejoDeportivo("Eva Perón","Aire libre",2,12,"Basquetball",1200);

        menu(complejos);
    }

    public static void menu(ComplejoDeportivo[] complejos){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("Ingrese una opcion" +
                    "\n1-Listar complejos 2-Ver el tipo de instalacion 3-Listar nombres 4-Ver superfice 5-Cant de canchas 6-Salir");
            try {
                op = sc.nextInt();
                switch (op){
                    case 1:
                        for (int i = 0; i < complejos.length; i++) {
                            System.out.println(complejos[i].listarCanchas(complejos));
                        }
                        break;
                    case 2:
                        for (int i = 0; i < complejos.length; i++) {
                            System.out.println(complejos[i].getTipo());
                        }
                        break;
                    case 3:
                        for (int i = 0; i < complejos.length; i++) {
                            System.out.println(complejos[i].nombreComplejo());
                        }
                        break;
                    case 4:
                        for (int i = 0; i < complejos.length; i++) {
                            System.out.println("Uperficie: " + complejos[i].superficie() + "\n-------------------------");
                        }
                        break;
                    case 5:
                        for (int i = 0; i < complejos.length; i++) {
                            System.out.println(complejos[i].cantCanchas());
                        }
                        break;
                    case 6:
                        System.out.println("GRACIAS POR SU TIEMPO");
                        op = 6;
                        break;
                    default:
                        System.out.println("<error> opcion erronea");
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("Ingrese solo numeros naturales");
            }
        }while (op != 6);
    }
}
package TrabajoPracticoN1;

import javax.swing.*;

public class TP1 {
    public static void main(String[] args) {

        String nombre;
        nombre = JOptionPane.showInputDialog("Introduzca su nombre: ");

        int edad;

        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad" + " " + "(0 para salir)"));

            if (edad >= 18){
                System.out.println(nombre + " " + "Es mayor de edad");
            }else
                System.out.println(nombre + " " +"Es menor de edad");

        }while (edad != 0);
    }
}

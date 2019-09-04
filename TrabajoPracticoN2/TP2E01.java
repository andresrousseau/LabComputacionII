package TrabajoPracticoN2;

import java.util.Scanner;

public class TP2E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arrNumeros = new int [10];
        int pos = 0;
        int neg = 0;
        int cer = 0;

        for (int i = 0; i <arrNumeros.length ; i++) {
            System.out.println("Ingres 10 numeros enteros: ");
            arrNumeros [i] = sc.nextInt();


        }
        for (int valor:arrNumeros){
            if (valor > 0){
                pos++;
            }else
            if (valor < 0){
                neg++;
            }else
                cer++;
        }
        System.out.println("Positivos: "+pos+" Negativos: "+neg+" Ceros: "+cer);
    }
}

package TrabajoPracticoN3;

public class TP3E04 {
    public static void main(String[] args) {

        int [][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length ; i++) {

            for (int j = 0; j < matriz.length ; j++) {

                matriz[i][j] = (int)(Math.random()*30);
            }
        }

        for (int[] dimension1:matriz){
            for (int elemento:dimension1){
                System.out.print(elemento+" ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length ; k++) {
                    for (int l = 0; l < matriz.length; l++) {

                        if (matriz[i][j] < matriz[k][l]){
                            int t = matriz[i][j];
                            matriz [i][j] = matriz [k][l];
                            matriz[k][l] = t;
                        }

                    }

                }

            }

        }
        System.out.println("- - - - - - -");
        for (int[] dimension1:matriz){
            for (int elemento:dimension1){
                System.out.print(elemento+" ");
            }
            System.out.println(" ");
        }

    }
}

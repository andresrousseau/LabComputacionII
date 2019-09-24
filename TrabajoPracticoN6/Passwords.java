package TrabajoPracticoN6;

import java.util.Random;

public class Passwords {

    private char[] caracteres={'0','1','2','3','4','5','6','7','8','9',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ',
            'o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ',
            'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private Random random = new Random();

    private String [] passwardsArray;

    public Passwords(int cantidadDeContrasenias, int longitudContrasenias){

        this.passwardsArray = new String[cantidadDeContrasenias];

        for (int i = 0; i <this.passwardsArray.length ; i++) {

            this.passwardsArray[i] = " ";

            for (int j = 0; j < longitudContrasenias; j++) {
                this.passwardsArray[i] += String.valueOf(caracteres[random.nextInt(64)]);

            }

        }
    }

    public String [] getPasswards (){
        return passwardsArray;
    }

    public int analizarSeguridad (String pass){

        int mayusculas = 0, minusculas = 0, numeros = 0;

        for (int i = 0; i < pass.length() ; i++) {
            if (Character.isUpperCase(pass.charAt(i))){
                mayusculas++;
            }else if (Character.isLowerCase(pass.charAt(i))){
                minusculas++;
            }else{
                numeros++;
            }
        }
        if (numeros > 5 && mayusculas > 2 && minusculas > 1) {
            return 1;
        }
        else return 0;
    }
}

package TFI01;

public class Cine {
    public static void main(String[] args){

        Espectadores espec01 = new Espectadores("Juan", 22,"D",5);

        Salas Sala01 = new Salas(3,"Jocker");

        Acomodadores acomodador01 = new Acomodadores("Pedro",32);

        acomodador01.sala();
        acomodador01.setSueldoPersona(50000);

        System.out.println(acomodador01.datosPersona());

        Empleados emp01 = new Empleados("Marta",32);

        System.out.println(emp01.datosPersona());

    }
}

package TrabajoPracticoN8;

public class Principal {
    public static void main(String[] args){

        Vehiculo[] vehiculos = new Vehiculo[5];

        vehiculos[0] = new Moto(40);
        vehiculos[1] = new Moto(70);
        vehiculos[2] = new Moto(180);
        vehiculos[3] = new Moto(240);
        vehiculos[4] = new Moto(50);

        System.out.println(vehiculos[3].acelerar(110));
        System.out.println(vehiculos[3].frenar(70));
        System.out.print("Cantidad de plazas: ");
        System.out.println(vehiculos[3].plazas());
    }
}

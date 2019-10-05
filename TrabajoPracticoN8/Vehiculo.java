package TrabajoPracticoN8;

public interface Vehiculo {

    final int VELOCIDAD_MACIMA = 120;

    String frenar(int cantidad);

    String frenar(int cant_a, int cant_d);

    String acelerar(int cantidad);

    int plazas();
}

package TrabajoPracticoN8;

public class Moto implements Vehiculo {

   int velocidad;

   public Moto(int velocidad){
       this.velocidad = velocidad;
   }

    @Override
    public String frenar(int cantidad) {

       this.velocidad = this.velocidad - cantidad;
       return "Velocidad reducida en " + cantidad + " Km/h ahora transita a "
                +this.velocidad + " Km/h";
    }

    @Override
    public String frenar(int cant_a, int cant_d) {
        return null;
    }

    @Override
    public String acelerar(int cantidad) {

       this.velocidad = this.velocidad + cantidad;
       String mensaje = " ";
       if ((this.velocidad + cantidad) > this.VELOCIDAD_MACIMA){
           mensaje = "\n Se ha excedido el limite de velocidad";
       }
        return "La velocidad incremento en " + cantidad + " Km/h ahora transita a "
                        + this.velocidad + " km/h" + mensaje;
    }

    @Override
    public int plazas() {
        return 2;
    }
}

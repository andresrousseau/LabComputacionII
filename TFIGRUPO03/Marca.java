package TFIGRUPO03;

import javax.swing.*;
import java.util.*;

public class Marca extends Operaciones{
    public List<Vehiculo> vehiculos = new ArrayList<>();
    private String nombre;

    //constructor
    public Marca(String nombre){
        this.nombre = nombre;

    }

    protected void agregar(Vehiculo modelo){
        vehiculos.add(modelo);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //utilizando el iterador recorre la coleccion y compara por modelo para incremetar o reducir el precio
    @Override
    public void aumentarPrecio(String modelo,double precio){
        Iterator<Vehiculo> iterador = vehiculos.iterator();
        while(iterador.hasNext()){
            String nom = iterador.next().getModelo();
            if(nom.equals(modelo)){
                double pre = iterador.next().getPrecio();
                iterador.next().setPrecio(pre+precio);
            }
        }
    }
    public void eliminar(String nombre){
        Iterator<Vehiculo> iterador = vehiculos.iterator();
        while(iterador.hasNext()){
            String nom = iterador.next().getModelo();
            if(nom.equals(nombre)){
                iterador.remove();

                System.out.println("elemento borrado");
            }
        }
    }

    @Override
    public void decrementarPrecio(String modelo,double precio){
        Iterator<Vehiculo> iterador = vehiculos.iterator();
        while(iterador.hasNext()){
            String nom = iterador.next().getModelo();
            if(nom.equals(modelo)){
                double pre = iterador.next().getPrecio();
                if(pre-iterador.next().getPrecio() <=0){
                    iterador.next().setPrecio(0);
                }else {
                    iterador.next().setPrecio(pre - precio);
                }
            }
        }
    }
    //utilizando el remove del iterador elimina un objeto de la coleccion
    @Override
    public void eliminarVehiculo(String modelo){
        Iterator<Vehiculo> iterador = vehiculos.iterator();
        while(iterador.hasNext()){
            String nom = iterador.next().getModelo();
            if(nom.equals(modelo)){
                iterador.remove();
            }
        }
    }

    //Mostrar lista de vehiculos
    public void mostrar(){
        for(Vehiculo vehiculo : this.vehiculos){
            System.out.println(vehiculo.toString());
        }
    }
}

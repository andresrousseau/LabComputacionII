package TFI01;

public class Espectadores extends Personas {

    private String fila;
    private int silla;
    private String butaca;

    public Espectadores(String nombre, int edad,String fila, int silla){

    }


    @Override
    public String tipoPersona() {
        return null;
    }

    @Override
    public String datosPersona() {
        return null;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public String getButaca() {
        return fila+silla;
    }

    public void setButaca(String butaca) {
        this.butaca = butaca;
    }
}

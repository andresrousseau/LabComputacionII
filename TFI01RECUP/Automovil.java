package TFI01RECUP;

public abstract class Automovil {

    private String chofer;
    private String destino;
    private String[] listaPasajeros;

    public abstract String toString();


    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String[] getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(String[] listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }
}

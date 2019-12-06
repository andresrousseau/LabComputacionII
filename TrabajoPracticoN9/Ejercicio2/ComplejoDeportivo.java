package TrabajoPracticoN9.Ejercicio2;

public class ComplejoDeportivo implements Presentacion, Detalles{
    private String nombre;
    private String instalacion;
    private int cantOffice;
    private int cantCanchas;
    private String deporte;
    private double superficie;

    public ComplejoDeportivo() {
    }

    public ComplejoDeportivo(String nombre, String instalacion, int cantOffice, int cantCanchas, String deporte, double superficie) {
        this.nombre = nombre;
        this.instalacion = instalacion;
        this.cantOffice = cantOffice;
        this.cantCanchas = cantCanchas;
        this.deporte = deporte;
        this.superficie = superficie;
    }

    @Override
    public String nombreComplejo() {
        return "Nombre: "+this.nombre+
                "\n-------------------------";
    }

    @Override
    public double superficie() {
        return this.superficie;
    }

    @Override
    public String cantOficinas() {
        return "Cantidad canchas: "+this.cantCanchas+
                "\n-------------------------";
    }


    @Override
    public String listarCanchas(ComplejoDeportivo[] complejos) {
        return "Nombre: "+this.nombre+
                "\nCant Canchas: "+this.cantCanchas+
                "\nSe juega: "+this.deporte+
                "\n-------------------------";
    }

    @Override
    public String cantCanchas() {
        return "Complejo "+this.nombre+"\nCant de canchas: "+this.cantCanchas
                +"\n-------------------------";
    }

    @Override
    public String getTipo() {
        return "Complejo: "+this.nombre+
                "Instalacion: "+this.instalacion;
    }
}

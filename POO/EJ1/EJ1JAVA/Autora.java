package POO.EJ1JAVA;

public class Autora {
    private String nombre;
    private String apellidos;

    public Autora(String pnombre, String papellidos) {
        this.nombre = pnombre;
        this.apellidos = papellidos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String papellidos) {
        this.apellidos = papellidos;
    }
}

package POO.EJ1JAVA;

import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private Date fechaNacimiento;
    private Libro ultimoLibroComprado;

    public Cliente(String pnombre, String papellidos, String pdni, String pemail, Date pfechaNacimiento, Libro pultimoLibroComprado) {
        this.nombre = pnombre;
        this.apellidos = papellidos;
        this.dni = pdni;
        this.email = pemail;
        this.fechaNacimiento = pfechaNacimiento;
        this.ultimoLibroComprado = pultimoLibroComprado;
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

    public String getDni() {
        return this.dni;
    }

    public void setDni(String pdni) {
        this.dni = pdni;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String pemail) {
        this.email = pemail;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date pfechaNacimiento) {
        this.fechaNacimiento = pfechaNacimiento;
    }

    public Libro getUltimoLibroComprado() {
        return this.ultimoLibroComprado;
    }

    public void setUltimoLibroComprado(Libro pultimoLibroComprado) {
        this.ultimoLibroComprado = pultimoLibroComprado;
    }
}
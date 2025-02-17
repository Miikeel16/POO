package POO.EJ1JAVA;

import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private Date fechaNacimiento;
    private Libro ultimoLibroComprado;

    public Cliente(String nombre, String apellidos, String dni, String email, Date fechaNacimiento, Libro ultimoLibroComprado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.ultimoLibroComprado = ultimoLibroComprado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Libro getUltimoLibroComprado() {
        return ultimoLibroComprado;
    }

    public void setUltimoLibroComprado(Libro ultimoLibroComprado) {
        this.ultimoLibroComprado = ultimoLibroComprado;
    }
}
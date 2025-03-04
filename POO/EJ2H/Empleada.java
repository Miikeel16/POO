package POO.EJ2H;

public abstract class Empleada {
    protected String nombre;
    protected String apellidos;
    protected double salario;

    public Empleada(String pnombre, String papellidos, double psalario){
        this.nombre=pnombre;
        this.apellidos=papellidos;
        this.salario=psalario;
    }
    public void pagar_salario(){
        System.out.println("Pago a: "+this.nombre+" "+this.apellidos+" - Salario: "+this.salario+" euros.");
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
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    }

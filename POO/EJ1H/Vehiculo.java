package POO.EJ1H;

public class Vehiculo{
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private double kilometraje;

    //////////CONSTRUCTORES//
    
    public Vehiculo(String pmarca, String pmodelo, int pañoFabricacion, double pkilometraje){  
        this.marca=pmarca;
        this.modelo=pmodelo;
        this.añoFabricacion=pañoFabricacion;
        this.kilometraje=pkilometraje;
    }
    public void mostrar_info(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Año de fabricacion: "+this.añoFabricacion);
        System.out.println("Kilometraje: "+this.kilometraje);
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String pmarca) {
        this.marca = pmarca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String pmodelo) {
        this.modelo = pmodelo;
    }
    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    public void setAñoFabricacion(int pañoFabricacion) {
        this.añoFabricacion = pañoFabricacion;
    }
    public double getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(double pkilometraje) {
        this.kilometraje = pkilometraje;
    }
}
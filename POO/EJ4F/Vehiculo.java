package POO.EJ4F;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double rendimiento;
    private double capacidadTanque;

    public Vehiculo(String pmarca, String pmodelo, double prendimiento, double pcapacidadTanque){
        this.marca=pmarca;
        this.modelo=pmodelo;
        this.rendimiento=prendimiento;
        this.capacidadTanque=pcapacidadTanque;
    }

    public double calcularAutonomia(){
        return this.capacidadTanque/this.rendimiento;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String pmarca) {
        this.marca = pmarca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String pmodelo) {
        this.modelo = pmodelo;
    }
    public double getRendimiento() {
        return this.rendimiento;
    }
    public void setRendimiento(double prendimiento) {
        this.rendimiento = prendimiento;
    }
    public double getCapacidadTanque() {
        return this.capacidadTanque;
    }
    public void setCapacidadTanque(double pcapacidadTanque) {
        this.capacidadTanque = pcapacidadTanque;
    }
}

package POO.EJ1H;


public class Camion extends Vehiculo {
    private double carga;
    private String tipoCarga;

    public Camion(String pmarca, String pmodelo, int pañoFabricacion, double pkilometraje, double pcarga, String ptipoCarga) {
        super(pmarca, pmodelo, pañoFabricacion, pkilometraje);
        this.carga=pcarga;
        this.tipoCarga=ptipoCarga;
    }
    @Override
    public void mostrar_info(){
        super.mostrar_info();
        System.out.println("Carga: "+this.carga);
        System.out.println("Tipo de carga: "+this.tipoCarga);
    }
    public double getCarga(){
        return this.carga;
    }
    public void setCarga(double pcarga){
        this.carga=pcarga;
    }
    public String getTipoCarga() {
        return tipoCarga;
    }
    public void setTipoCarga(String ptipoCarga) {
        this.tipoCarga = ptipoCarga;
    }
}

package POO.EJ1H;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private String tamañoMotor;

    ////////CONSTRUCTOR//
    public Coche(String pmarca, String pmodelo, int pañoFabricacion, double pkilometraje, int pnumeroPuertas, String ptamañoMotor) {
        super(pmarca, pmodelo, pañoFabricacion, pkilometraje);
        this.numeroPuertas=pnumeroPuertas;
        this.tamañoMotor=ptamañoMotor;
    }
    @Override
    public void mostrar_info(){
        super.mostrar_info();
        System.out.println("Numero de puertas: "+this.numeroPuertas);
        System.out.println("Tamaño del motor: "+this.tamañoMotor);
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int pnumeroPuertas) {
        this.numeroPuertas = pnumeroPuertas;
    }
    public String getTamañoMotor() {
        return tamañoMotor;
    }
    public void setTamañoMotor(String ptamañoMotor) {
        this.tamañoMotor = ptamañoMotor;
    }
    }
 
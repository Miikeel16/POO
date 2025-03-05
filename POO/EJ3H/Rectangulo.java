package POO.EJ3H;

public class Rectangulo extends Figura {
    private double radio;
    private double ancho;
    private double alto;
    private double base;
    private double altura;

    public Rectangulo(double pradio, double pancho, double palto, double pbase, double paltura){
        this.radio=pradio;
        this.ancho=pancho;
        this.alto=palto;
        this.base=pbase;
        this.altura=paltura;
    }
    public double calcularArea(){
        return this.alto*this.ancho;
    }
}

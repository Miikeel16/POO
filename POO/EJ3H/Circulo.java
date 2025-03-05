package POO.EJ3H;
public class Circulo extends Figura {
    private double radio;
    private double ancho;
    private double alto;
    private double base;
    private double altura;

    public Circulo(double pradio, double pancho, double palto, double pbase, double paltura){
        this.radio=pradio;
        this.ancho=pancho;
        this.alto=palto;
        this.base=pbase;
        this.altura=paltura;
    }
    public double calcularArea(){
        return Math.PI*(this.radio*this.radio);
    }
}

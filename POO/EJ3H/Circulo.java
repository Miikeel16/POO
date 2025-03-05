package POO.EJ3H;
public class Circulo extends Figura {
    private final double radio;
    private final double ancho;
    private final double alto;
    private final double base;
    private final double altura;

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

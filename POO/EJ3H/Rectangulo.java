package POO.EJ3H;

public class Rectangulo extends Figura {
    private final double radio;
    private final double ancho;
    private final double alto;
    private final double base;
    private final double altura;

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

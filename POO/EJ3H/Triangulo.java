package POO.EJ3H;

public class Triangulo extends Figura{
    private double radio;
    private double ancho;
    private double alto;
    private double base;
    private double altura;

    public Triangulo(double pradio, double pancho, double palto, double pbase, double paltura){
        this.radio=pradio;
        this.ancho=pancho;
        this.alto=palto;
        this.base=pbase;
        this.altura=paltura;
    }
    public double calcularArea(){
        return 0.5*this.base*this.altura;
    }
}

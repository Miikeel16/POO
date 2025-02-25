package POO.EJ4;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(2, 4, 6, 7);
        Rectangulo r3 = new Rectangulo(4, 6);
        r1.setNombre("Rectangulo 1");
        r2.setNombre("Rectangulo 2");
        r3.setNombre("Rectangulo 3");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        
        System.out.println("Total de rectángulos creados: " + Rectangulo.getNumeroDeRectangulos());
    }
}
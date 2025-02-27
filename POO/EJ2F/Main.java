package POO.EJ2F;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Coche", 14000, 21);

        System.out.println("Nombre del producto: "+p1.getNombre());
        System.out.println("Precio del producto: "+p1.getPrecioBase());
    }
}

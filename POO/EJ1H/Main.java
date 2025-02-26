package POO.EJ1H;

public class Main {
     public static void main(String[] args) {
        Coche coche1 = new Coche("Audi", "A4", 2023, 12.000, 4, "mediano");
        Camion camion1 = new Camion("Ford", "Raptor", 2018, 5.000, 4, "media");

        System.out.println("Informacion del Camion: ");
        camion1.mostrar_info();

        System.out.println("Informacion del Coche: ");
        coche1.mostrar_info();
     }
}

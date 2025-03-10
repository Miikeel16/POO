package POO.H2.EJH1;
public class Main {
    public static void main(String[] args) {

        JugadorLoL lol = new JugadorLoL("Faker", "China", "T1", 6, 22, "Jungla");
        JugadorCSGO csgo = new JugadorCSGO("Staxx", "España", "Heretics", 3, 30, 70);
        JugadorFIFA fifa = new JugadorFIFA("DjMariio", "España", "DuxGaming", 1, 17, 8);
        JugadorValorant valorant = new JugadorValorant("Mixwell", "España", "Heretics", 4, 33,"Gecko");

        System.out.print("Jugador de LoL: ");
        lol.mostrarInfo();
        lol.subirNivel();
        lol.ganarTorneo(26);
        System.out.print("Subir rango + puntos torneo: ");
        lol.mostrarInfo();
        System.out.println("");
        System.out.println("");
        System.out.print("Jugador de CSGO: ");
        csgo.mostrarInfo();
        csgo.subirNivel();
        csgo.ganarTorneo(26);
        System.out.print("Subir rango + puntos torneo: ");
        csgo.mostrarInfo();
        System.out.println("");
        System.out.println("");
        System.out.print("Jugador de FIFA: ");
        fifa.mostrarInfo();
        fifa.subirNivel();
        fifa.ganarTorneo(26);
        System.out.print("Subir rango + puntos torneo: ");
        fifa.mostrarInfo();
        System.out.println("");
        System.out.println("");
        System.out.print("Jugador de Valorant: ");
        valorant.mostrarInfo();
        valorant.subirNivel();
        valorant.ganarTorneo(26);
        System.out.print("Subir rango + puntos torneo: ");
        valorant.mostrarInfo();
        System.out.println("");
        System.out.println("");
    }
}

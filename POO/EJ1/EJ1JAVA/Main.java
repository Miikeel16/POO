package POO.EJ1.EJ1JAVA;

public class Main {
        public static void main(String[] args) throws InterruptedException {
            // Crear objetos
            Reloj reloj1 = new Reloj (59,59,22);
            System.out.println("Hora: "+reloj1);
            System.out.println("Hora en segundos: "+reloj1.enSegundos());
            reloj1.sumaSegundos();
            System.out.println("Hora mas un segundo: "+reloj1);
            reloj1.sumaMinutos();
            System.out.println("Hora mas un minuto: "+reloj1);
            reloj1.sumaHoras();
            System.out.println("Hora mas una hora: "+reloj1);
            reloj1.crearHoraConSegundos(150055);
            System.out.println("Hora con segundos introducidos: "+reloj1);
        }
    }
package POO.EJ1JAVA;

public class pruebasReloj {
        public static void main(String[] args) throws InterruptedException {
            // Crear objetos
            Reloj reloj1 = new Reloj (59,59,22);
            System.out.println(reloj1);
            System.out.println(reloj1.enSegundos());
            reloj1.sumaSegundos();
            System.out.println(reloj1);
            reloj1.sumaMinutos();
            System.out.println(reloj1);
            reloj1.sumaHoras();
            System.out.println(reloj1);
            System.out.println(reloj1.crearHoraConSegundos(150050));
            System.out.println(reloj1);
            System.out.println(reloj1.crearHoraConSegundos(86385));
            System.out.println(reloj1);

            for (int i = 1 ; i < 20 ; i++ ){
                Thread.sleep(1000);
                reloj1.sumaSegundos();
                System.out.println(reloj1);
            }
        }
    }
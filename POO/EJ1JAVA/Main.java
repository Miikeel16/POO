
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        int horas = ahora.getHour();
        int minutos = ahora.getMinute();
        int segundos = ahora.getSecond();


        Reloj reloj = new Reloj(horas, minutos, segundos);

        System.out.println("Hora actual del sistema: " + reloj.toString());

        reloj.sumaSegundos();
        System.out.println("Después de sumar 1 segundo: " + reloj.toString());

        reloj.sumaMinutos();
        System.out.println("Después de sumar 1 minuto: " + reloj.toString());

        reloj.sumaHoras();
        System.out.println("Después de sumar 1 hora: " + reloj.toString());
    }
}

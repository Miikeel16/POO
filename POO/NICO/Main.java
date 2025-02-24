package POO.NICO;

public class Main{
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(15,07,2024);
        Fecha f3 = new Fecha(2006);
        Fecha f4 = new Fecha(12,2024);

        f1.mostrarFecha();
        f2.mostrarFecha();
        f3.mostrarFecha();
        f4.mostrarFecha();

        Fecha hoy = new Fecha();

        hoy.setNow();
        hoy.mostrarFecha();
    }
}
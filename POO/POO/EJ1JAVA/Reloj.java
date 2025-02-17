package POO.EJ1JAVA;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public int enSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public void crearHoraConSegundos(int segundosTotales) {
        this.horas = (segundosTotales / 3600) % 24;
        segundosTotales %= 3600;
        this.minutos = segundosTotales / 60;
        this.segundos = segundosTotales % 60;
    }

    public void sumaSegundos() {
        crearHoraConSegundos(enSegundos() + 1);
    }

    public void sumaMinutos() {
        crearHoraConSegundos(enSegundos() + 60);
    }

    public void sumaHoras() {
        crearHoraConSegundos(enSegundos() + 3600);
    }
}

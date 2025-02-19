package POO.EJ1.EJ1JAVA;

public class Reloj {
    /*
    Cread los siguientes atributos  
    hora.
    minutos.
    segundos.*/

    //Método constructor

    private int segundos;
    private int minutos;
    private int horas;

    public Reloj(int psegundos, int pminutos, int phora){
        this.segundos = psegundos;
        this.minutos = pminutos;
        this.horas = phora;
    }

    public String toString(){
        return horas + ":" + minutos + ":" + segundos;
    }

    public int enSegundos(){
        return (horas * 3600) + (minutos * 60) + segundos;
    }

    public String crearHoraConSegundos(int phora){
        horas = phora / 3600;
        phora = phora % 3600;
        minutos = phora / 60;
        segundos = phora % 60;
        if (segundos >= 60){
            segundos = segundos - 60;
            sumaMinutos();
        }
        if (minutos >= 60){
            minutos = minutos - 60;
            sumaHoras();
        }
        if (horas >= 24){
            horas = horas - 24;
        }
        return horas + " hora/s " +minutos+ " minuto/s " + segundos + " segundo/s";
    }

    public void sumaSegundos(){
        segundos++;
        if (segundos >= 60){
            segundos = segundos - 60;
            sumaMinutos();
        }
    }

    public void sumaMinutos(){
        minutos++;
        if (minutos >= 60){
            minutos = minutos - 60;
            sumaHoras();
        }
    }

    public void sumaHoras(){
        horas++;
        if (horas >= 24){
            horas = horas - 24;
        }
    }

    // Getters y setters

    //Los otros métodos
}
package POO.H2.EJH1;

public class JugadorFIFA extends Jugador {
    private int golesAnotadosEnTorneos;

    public JugadorFIFA(String pnombre, String pnacionalidad, String pnombreEquipo, int ptorneosGanados, int ppuntosRanking, int pgolesAnotadosEnTorneos){
        super(pnombre, pnacionalidad, pnombreEquipo, ptorneosGanados, ppuntosRanking);
        this.golesAnotadosEnTorneos=pgolesAnotadosEnTorneos;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+", Nacionalidad: "+this.nacionalidad+", Nombre Equipo: "+this.nombreEquipo+", Categora: "+this.categoria+", Torneos Ganados: "+this.torneosGanados+", Puntos Ranking: "+this.puntosRanking+", Goles anotados en torneos: "+this.golesAnotadosEnTorneos);
    }
    public void ganarTorneo(int ppuntos){
        int cont=0;
        if (this.torneosGanados>0){
            while(cont<this.torneosGanados){
                this.puntosRanking= this.puntosRanking+ppuntos;
                cont++;
            }
        }else{
            this.puntosRanking=0;
        }
    }
    public void subirNivel(){
        if (this.categoria=="Rango 1"){
            this.categoria="Rango 2";
        }else if (this.categoria=="Rango 2"){
            this.categoria="Rango 3";
        }else if (this.categoria=="Rango 3"){
            this.categoria="Rango 4";
        }else if (this.categoria=="Rango 4"){
            this.categoria="Rango 5";
        }else if (this.categoria=="Rango 5"){
            this.categoria="Rango 6";
        }else if (this.categoria=="Rango 6"){
            this.categoria="Rango 7";
        }else if (this.categoria=="Rango 7"){
            this.categoria="Rango 8";
        }else if (this.categoria=="Rango 8"){
            this.categoria="Rango 9";
        }else{
            this.categoria="Rango 10";
        }
    }
    public int getGolesAnotadosEnTorneos() {
        return this.golesAnotadosEnTorneos;
    }
    public void setGolesAnotadosEnTorneos(int pgolesAnotadosEnTorneos) {
        this.golesAnotadosEnTorneos = pgolesAnotadosEnTorneos;
    }
} 

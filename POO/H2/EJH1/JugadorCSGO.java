package POO.H2.EJH1;

public class JugadorCSGO extends Jugador {
    private double precision;
    public JugadorCSGO(String pnombre, String pnacionalidad, String pnombreEquipo, int ptorneosGanados, int ppuntosRanking, double pprecision) {
        super(pnombre, pnacionalidad, pnombreEquipo, ptorneosGanados, ppuntosRanking);
        this.precision=pprecision;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+", Nacionalidad: "+this.nacionalidad+", Nombre Equipo: "+this.nombreEquipo+", Categora: "+this.categoria+", Torneos Ganados: "+this.torneosGanados+", Puntos Ranking: "+this.puntosRanking+", Precision: "+this.precision+"%.");
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
        if (this.categoria=="Unranked"){
            this.categoria="Silver";
        }else if (this.categoria=="Silver"){
            this.categoria="Gold";
        }else if (this.categoria=="Gold"){
            this.categoria="Master";
        }else if (this.categoria=="Master"){
            this.categoria="Legendary   ";
        }else if (this.categoria=="Legendary"){
            this.categoria="Suprem Master";
        }else{
            this.categoria="Global";
        }
    }
    public double getPrecision() {
        return this.precision;
    }
    public void setPrecision(double pprecision) {
        this.precision = pprecision;
    }
}

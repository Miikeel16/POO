package POO.H2.EJH1;

public class JugadorValorant extends Jugador {
    private String agenteFavorito;

    public JugadorValorant (String pnombre, String pnacionalidad, String pnombreEquipo, int ptorneosGanados, int ppuntosRanking, String pagenteFavorito){
        super(pnombre, pnacionalidad, pnombreEquipo, ptorneosGanados, ppuntosRanking);
        this.agenteFavorito=pagenteFavorito;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+", Nacionalidad: "+this.nacionalidad+", Nombre Equipo: "+this.nombreEquipo+", Categora: "+this.categoria+", Torneos Ganados: "+this.torneosGanados+", Puntos Ranking: "+this.puntosRanking+", Agente favorito: "+this.agenteFavorito);
    }
    public void ganarTorneo(int ppuntos){
        super.ganarTorneo(ppuntos);
    }
    public void subirNivel(){
        if (this.categoria=="Unranked"){
            this.categoria="Iron";
        }else if (this.categoria=="Iron"){
            this.categoria="Bronze";
        }else if (this.categoria=="Bronze"){
            this.categoria="Silver";
        }else if (this.categoria=="Silver"){
            this.categoria="Gold";
        }else if (this.categoria=="Gold"){
            this.categoria="Platinum";
        }else if (this.categoria=="Platinum"){
            this.categoria="Diamond";
        }else if (this.categoria=="Diamond"){
            this.categoria="Inmortal";
        }else{
            this.categoria="Radiant";
        }
    }
    public String getAgenteFavorito() {
        return this.agenteFavorito;
    }
    public void setAgenteFavorito(String pagenteFavorito) {
        this.agenteFavorito = pagenteFavorito;
    }
}

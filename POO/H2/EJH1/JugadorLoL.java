package POO.H2.EJH1;

public class JugadorLoL extends Jugador {
    private String rolPrincipal;

    public JugadorLoL(String pnombre, String pnacionalidad, String pnombreEquipo, int ptorneosGanados, int ppuntosRanking, String prolPrincipal){
        super(pnombre, pnacionalidad, pnombreEquipo, ptorneosGanados, ppuntosRanking);
        this.rolPrincipal=prolPrincipal;
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
            this.categoria="Emerald";
        }else if (this.categoria=="Emerald"){
            this.categoria="Diamond";
        }else if (this.categoria=="Diamond"){
            this.categoria="Master";
        }else if (this.categoria=="Master"){
            this.categoria="Grand Master";
        }else{
            this.categoria="Challenger";
        }
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+", Nacionalidad: "+this.nacionalidad+", Nombre Equipo: "+this.nombreEquipo+", Categora: "+this.categoria+", Torneos Ganados: "+this.torneosGanados+", Puntos Ranking: "+this.puntosRanking+", Rol Principal: "+this.rolPrincipal);
    }
    public String getRolPrincipal(){
        return this.rolPrincipal;
    }
    public void setRolPrincipal(String prolPrincipal){
        this.rolPrincipal=prolPrincipal;
    }
}

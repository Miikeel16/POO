package POO.H2.EJH1;

public abstract class Jugador {
    protected String nombre;
    protected String nacionalidad;
    protected String nombreEquipo;
    protected int torneosGanados;
    protected int puntosRanking;
    protected String categoria;

    public Jugador (String pnombre, String pnacionalidad, String pnombreEquipo, int ptorneosGanados, int ppuntosRanking){

        this.nombre=pnombre;
        this.nacionalidad=pnacionalidad;
        this.nombreEquipo=pnombreEquipo;
        this.torneosGanados=ptorneosGanados;
        this.puntosRanking=ppuntosRanking;
        this.categoria="Unranked";
    }
    public void ganarTorneo(int ppuntos){
        this.puntosRanking=this.puntosRanking + ppuntos;
    }
    public abstract void subirNivel();

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    public void setNacionalidad(String pnacionalidad) {
        this.nacionalidad = pnacionalidad;
    }
    public String getNombreEquipo() {
        return this.nombreEquipo;
    }
    public void setNombreEquipo(String pnombreEquipo) {
        this.nombreEquipo = pnombreEquipo;
    }
    public int getTorneosGanados() {
        return this.torneosGanados;
    }
    public void setTorneosGanados(int ptorneosGanados) {
        this.torneosGanados = ptorneosGanados;
    }
    public int getPuntosRanking() {
        return this.puntosRanking;
    }
    public void setPuntosRanking(int ppuntosRanking) {
        this.puntosRanking = ppuntosRanking;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String pcategoria) {
        this.categoria = pcategoria;
    }
}


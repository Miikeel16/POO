package POO.H2.EJH2;

public class AtletaCiclismo extends Atleta {
    private String bicicletaUsada;

    public AtletaCiclismo(String pnombre, String pnacionalidad, int pedad, String pdisciplina, int pmedallasGanadas, String pbicicletaUsada){
        super(pnombre, pnacionalidad, pedad, pdisciplina, pmedallasGanadas);
        this.bicicletaUsada=pbicicletaUsada;
    }
    public String getBicicletaUsada() {
        return this.bicicletaUsada;
    }
    public void setBicicletaUsada(String pbicicletaUsada) {
        this.bicicletaUsada = pbicicletaUsada;
    }
    public void ganarMedalla(String ptipo){
        super.ganarMedalla(ptipo);
    }
}

package POO.H2.EJH2;

public class AtletaGimnasia extends Atleta {
    private String aparatoUsado;

    public AtletaGimnasia(String pnombre, String pnacionalidad, int pedad, String pdisciplina, int pmedallasGanadas, String paparatoUsado){
        super(pnombre, pnacionalidad, pedad, pdisciplina, pmedallasGanadas);
        this.aparatoUsado=paparatoUsado;
    }
    public String getAparatoUsado() {
        return this.aparatoUsado;
    }
    public void setAparatoUsado(String paparatoUsado) {
        this.aparatoUsado = paparatoUsado;
    }
    public void ganarMedalla(String ptipo){
        super.ganarMedalla(ptipo);
    }
}

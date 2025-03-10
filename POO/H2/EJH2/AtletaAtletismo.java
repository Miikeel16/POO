package POO.H2.EJH2;

public class AtletaAtletismo extends Atleta {
    private String distanciaPreferida;

    public AtletaAtletismo(String pnombre, String pnacionalidad, int pedad, String pdisciplina, int pmedallasGanadas, String pdistanciaPreferida){
        super(pnombre, pnacionalidad, pedad, pdisciplina, pmedallasGanadas);
        this.distanciaPreferida=pdistanciaPreferida;
    }
    public String getDistanciaPreferida() {
        return this.distanciaPreferida;
    }
    public void setDistanciaPreferida(String pdistanciaPreferida) {
        this.distanciaPreferida = pdistanciaPreferida;
    }
    public void ganarMedalla(String ptipo){
        super.ganarMedalla(ptipo);
    }
    public void mejorarMarca(double pnuevaMarca){
        super.mejorarMarca(pnuevaMarca);
    }
    public void cambiarDisciplina(String pnuevaDisciplina){
        super.cambiarDisciplina(pnuevaDisciplina);
    }
}

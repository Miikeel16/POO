package POO.H2.EJH2;

public class AtletaNatacion extends Atleta {
    private String estiloPrincipal;

    public AtletaNatacion(String pnombre, String pnacionalidad, int pedad, String pdisciplina, int pmedallasGanadas, String pestiloPrincipal){
        super(pnombre, pnacionalidad, pedad, pdisciplina, pmedallasGanadas);
        this.estiloPrincipal=pestiloPrincipal;
    }

    public void setEstiloPrincipal(String pestiloPrincipal){
        this.estiloPrincipal=pestiloPrincipal;
    }
    public String getEstiloPrincipal(){
        return this.estiloPrincipal;
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

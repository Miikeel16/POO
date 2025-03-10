package POO.H2.EJH2;

public class Atleta {
    protected String nombre;
    protected String nacionalidad;
    protected int edad;
    protected String disciplina;
    protected int medallasGanadas;


    public Atleta(String pnombre, String pnacionalidad, int pedad, String pdisciplina, int pmedallasGanadas){
        this.nombre=pnombre;
        this.nacionalidad=pnacionalidad;
        this.edad=pedad;
        this.disciplina=pdisciplina;
        this.medallasGanadas=pmedallasGanadas;
    }
    public void setNombre(String pnombre){
        this.nombre=pnombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNacionalidad(String pnacionalidad){
        this.nacionalidad=pnacionalidad;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public void setEdad(int pedad){
        this.edad=pedad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setDisciplina(String pdisciplina){
        this.disciplina=pdisciplina;
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    public void setMedallasGanadas(int pmedallasGanadas){
        this.medallasGanadas=pmedallasGanadas;
    }
    public int getMedallasGanadas(){
        return this.medallasGanadas;
    }
    public void ganarMedalla(String ptipo){
        if (ptipo=="oro" || ptipo == "ORO" || ptipo == "Oro") {
            System.out.println("Medalla de Oro añadida");
            this.medallasGanadas++;
        }else if (ptipo=="plata" || ptipo == "PLATA" || ptipo == "Plata") {
            System.out.println("Medalla de Plata añadida");
            this.medallasGanadas++;
        }else if (ptipo=="bronce" || ptipo == "BRONCE" || ptipo == "Bronce") {
            System.out.println("Medalla de Bronce añadida");
            this.medallasGanadas++;
        }
    }
    public void mejorarMarca(double pnuevaMarca){
        double mejorMarca=0;
        if (pnuevaMarca>mejorMarca){
            mejorMarca=pnuevaMarca;
            System.out.println("Nueva mejor marca: "+mejorMarca);
        }else{
            System.out.println("Marca no superada: "+mejorMarca);
        }
    }
    public void cambiarDisciplina(String pnuevaDisciplina){
        this.disciplina=pnuevaDisciplina;
    }
}

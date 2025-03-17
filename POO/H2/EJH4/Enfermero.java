package POO.H2.EJH4;

public class Enfermero extends Personal{
    protected String areaAsignada;
    protected String pacientesBajoCuidados;
    public Enfermero (String pnombre, int pedad, int pnumeroIdentificacion, String pturnoTrabajo, int paniosExperiencia, String pareaAsignada, String ppacientesBajoCuidados){
        super(pnombre, pedad, pnumeroIdentificacion, pturnoTrabajo, paniosExperiencia);
        this.areaAsignada=pareaAsignada;
        this.pacientesBajoCuidados=ppacientesBajoCuidados;
    }
}

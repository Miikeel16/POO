package POO.H2.EJH4;


public class Doctor extends Personal{
    private String especialidadMedica;
    private int numeroPacientes;

    public Doctor (String pnombre, int pedad, int pnumeroIdentificacion, String pturnoTrabajo, int paniosExperiencia, String pespecialidadMedica, int pnumeroPacientes){
        super(pnombre, pedad, pnumeroIdentificacion, pturnoTrabajo, paniosExperiencia);
        this.especialidadMedica=pespecialidadMedica;
        this.numeroPacientes=pnumeroPacientes;
    }
       
}

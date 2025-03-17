package POO.H2.EJH4;

public class Personal{
    protected String nombre;
    protected int edad;
    protected int numeroIdentificacion;
    protected String turnoTrabajo;
    protected int aniosExperiencia;

    public Personal (String pnombre, int pedad, int pnumeroIdentificacion, String pturnoTrabajo, int paniosExperiencia){
        this.nombre=pnombre;
        this.edad=pedad;
        this.numeroIdentificacion=pnumeroIdentificacion;
        this.turnoTrabajo=pturnoTrabajo;
        this.aniosExperiencia=paniosExperiencia;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String pnombre){
        this.nombre=pnombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int pedad){
        this.edad=pedad;
    }
}
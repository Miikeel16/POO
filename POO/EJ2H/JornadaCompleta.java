package POO.EJ2H;

public class JornadaCompleta extends Empleada {
    private double bonoDesempeno;

    public JornadaCompleta(String pnombre, String papellidos, double psalario, double pbonoDesempeno){
        super(pnombre, papellidos, psalario);
        this.bonoDesempeno=pbonoDesempeno;
    }
    public double getBonoDesempeno() {
        return bonoDesempeno;
    }
    public void setBonoDesempeno(double bonoDesempeno) {
        this.bonoDesempeno = bonoDesempeno;
    }
    @Override
    public void pagar_salario(){
        double salarioTotal= (40*10)+bonoDesempeno;
        System.out.println("Pago a: " + nombre + " " + apellidos + " - Salario: " + salarioTotal + " euros");
    }
    
}

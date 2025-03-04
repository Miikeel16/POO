package POO.EJ2H;

public class JornadaParcial extends Empleada {
    private int horasTrabajadas;

    public JornadaParcial(String pnombre, String papellidos, double psalario, int phorasTrabajadas){
        super(pnombre, papellidos, psalario);
        this.horasTrabajadas=phorasTrabajadas;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public void pagar_salario(){
        double salarioTotal= this.horasTrabajadas * 10;
        System.out.println("Pago a: " + nombre + " " + apellidos + " - Salario: " + salarioTotal + " euros");
    }
}

package POO.EJ1F;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int numeroCuenta;
    private int retirosDelDia=0;
    private int limiteRetiros=3;

    public CuentaBancaria(String ptitular, double psaldo, int pnumeroCuenta, int pretirosDelDia){
        this.titular=ptitular;
        this.saldo=psaldo;
        this.numeroCuenta=pnumeroCuenta;
        this.retirosDelDia=pretirosDelDia;
    }
    public void depositar(double cantidad){
        if (cantidad > 0){
            this.saldo= this.saldo + cantidad;
            System.out.println("Deposito realizado, nuevo saldo: "+this.saldo);
        }else{
            System.out.println("La cantidad debe ser mayor a 0");
        }
    }
    public void retirar(double cantidad){
        if (this.retirosDelDia<this.limiteRetiros){
            if(cantidad>0){
                if (cantidad <= this.saldo){
                    this.saldo= this.saldo - cantidad;
                    this.retirosDelDia++;
                    System.out.println("Retirada realizada, nuevo saldo: "+this.saldo);
                }else{
                    System.out.println("Fondos insuficientes");
                    return;
                }
            }else{
                System.out.println("La cantidad a retirar debe ser mayor a 0");
                return;
            }
        }else{
            System.out.println("Ya has realizado los 3 retiros maximos del dia");
            return;
        }
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double psaldo) {
        this.saldo = psaldo;
    }
    public String getTitular() {
        return this.titular;
    }
    public void setTitular(String ptitular) {
        this.titular = ptitular;
    }
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }
    public void setNumeroCuenta(int pnumeroCuenta) {
        this.numeroCuenta = pnumeroCuenta;
    }
    public int getLimiteRetiros() {
        return this.limiteRetiros;
    }
    public void setLimiteRetiros(int plimiteRetiros) {
        this.limiteRetiros = plimiteRetiros;
    }
    public int getRetirosDelDia() {
        return this.retirosDelDia;
    }
    public void setRetirosDelDia(int pretirosDelDia) {
        this.retirosDelDia = pretirosDelDia;
    }
}

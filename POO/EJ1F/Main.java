package POO.EJ1F;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Mikel", 1500, 16, 0);

        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());
        
        cuenta1.depositar(500);
        cuenta1.retirar(300);
        cuenta1.retirar(400);
        cuenta1.retirar(200);
        cuenta1.retirar(100);
    }
}

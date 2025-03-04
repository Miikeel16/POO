package POO.EJ2H;

public class Main {
    public static void main(String[] args) {
        JornadaCompleta e1 = new JornadaCompleta("Ana", "García", 0, 100);
        JornadaParcial e2 = new JornadaParcial("Luis", "Martínez", 0, 25);

        e1.pagar_salario();
        e2.pagar_salario();
    }
}

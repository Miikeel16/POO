package POO.EJ4F;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1= new Vehiculo("Audi", "A4", 5, 150);

        System.out.println("Veiculo: "+v1.getMarca()+" "+v1.getModelo());
        System.out.println("Kilometros por tanque lleno: "+v1.calcularAutonomia());

    }
}

package POO.EJ2.EJ2JAVA;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String pnombre = teclado.nextLine();
        System.out.println("Dime tu edad: ");
        int pedad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dime tu sexo: ");
        String psexo = teclado.nextLine();
        System.out.println("Dime tu peso: ");
        double ppeso = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Dime tu altura: ");
        int paltura = teclado.nextInt();

        ////////OBJETOS//////
        Persona persona1 = new Persona(pnombre, pedad, psexo, ppeso, paltura);
        Persona persona2 = new Persona(pnombre, psexo,  pedad);
        Persona persona3 = new Persona();

        persona3.setNombre("MIKEL");
        persona3.setEdad(18);
        persona3.setDni("637483921K");
        persona3.setSexo("H");
        persona3.setPeso(70);
        persona3.setAltura(181);

        String imc="";
        if (persona1.calcularIMC(ppeso, paltura) == -1) {
            imc="Peso Bajo";
        }else if (persona1.calcularIMC(ppeso, paltura) == 0) {
            imc="Peso Ideal";
        }else{
            imc="Sobrepeso";
        }

        String imc2="";
        if (persona3.calcularIMC(ppeso, paltura) == -1) {
            imc2="Peso Bajo";
        }else if (persona3.calcularIMC(ppeso, paltura) == 0) {
            imc2="Peso Ideal";
        }else{
            imc2="Sobrepeso";
        }

        System.out.println(persona1+" IMC: "+imc);
        System.out.println(persona2);
        System.out.println(persona3+" IMC: "+imc2);

    }
}
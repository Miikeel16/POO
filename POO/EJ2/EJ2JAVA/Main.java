package POO.EJ2.EJ2JAVA;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String pnombre = teclado.nextLine();
        System.out.println("Dime tu edad: ");
        int pedad = teclado.nextInt();
        System.out.println("Dime tu sexo: ");
        String psexo = teclado.nextLine();
        System.out.println("Dime tu peso: ");
        double ppeso = teclado.nextDouble();
        System.out.println("Dime tu altura: ");
        double paltura = teclado.nextDouble();
        
        Persona persona1 = new Persona(String pnombre, int pedad, String psexo, double ppeso, double paltura);
        Persona persona2 = new Persona(String pnombre, int pedad, String psexo);
        Persona persona3 = new Persona(String pnombre, int pedad, String psexo, double paltura);


    }
}
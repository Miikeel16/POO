package POO.NICO;

public class Main{
    public static void main(String[] args) {

        Fecha hoy = new Fecha();

        // int cont=0;
        // while (cont <365) {
        //     f1.mostrarFecha();
        //     f1.next();
        //     cont++;
        // }

        // hoy.setNow();
        // int valor;
        // valor = hoy.valueOf();
        // hoy.mostrarFecha();
        // System.out.println("El valor es: "+valor);
        // hoy.valueOf();

        // System.out.println(hoy.toString());

        hoy.parseInt(20021225);
        System.out.println(hoy);
    }
}
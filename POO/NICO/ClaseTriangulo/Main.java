package POO.NICO.ClaseTriangulo;

public class Main {
    public static void main(String[] args) {
        Triangulo Figuras[] = new Triangulo[15];
        
        for (int i = 0; i < Figuras.length; i++) {
            Figuras[i] = new Triangulo();
            Figuras[i].inicializar();
        }
        for (Triangulo triangulo : Figuras) {
            System.out.println(triangulo);
        }
        Triangulo t1 =new Triangulo(5, 4, 7);
        int cont=0;
        for(int i = 0; i<Figuras.length;i++){
            if (t1.equals(Figuras[i])){
                cont++;
            }
        }
        System.out.println("Triangulos iguales al creado: "+cont);
    }
}

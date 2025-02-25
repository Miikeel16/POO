package POO.EJ4;

public class Rectangulo {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private static int numeroDeRectangulos = 0;
        private String nombre;
        private String nombreDeLaFigura="Rectangulo";
        private static double PI=3.1416;
    
    
        /////////////CONSTRUCTORES///////
        
        public Rectangulo(){
            this.x1=0;
            this.y1=0;
            this.x2=1;
            this.y2=1;
        }
        public Rectangulo(double px1, double py1, double px2, double py2){
            this.x1=px1;
            this.y1=py1;
            this.x2=px2;
            this.y2=py2;
            numeroDeRectangulos++;
        }
        public Rectangulo(double base, double altura){
            this.x1=0;
            this.y1=0;
            this.x2=base;
            this.y2=altura;
        }
        public String getNombre() {
            return this.nombre;
        }
        public void setNombre(String pnombre) {
            this.nombre = pnombre;
        }
        public double calcularSuperficie(){
            return (x2 - x1) * (y2 - y1);
        }
        public double calcularPerimetro(){
            return 2 * ((x2 - x1) + (y2 - y1));
        }
        public void desplazar(double px, double py) {
            x1 += px;
            x2 += px;
            y1 += py;
            y2 += py;
        }
        public static int getNumeroDeRectangulos(){
            return numeroDeRectangulos;
        }
        public String toString() {
            return "Nombre: " + nombre + ", Coordenadas: (" + x1 + ", " + y1 + ") - (" + x2 + ", " + y2 + ")"+", Superficie: " + calcularSuperficie() + ", Perímetro: " + calcularPerimetro();
        }
}
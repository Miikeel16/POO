package POO.EJ1JAVA;

public class Genero {
    private String nombre;
    private int edadMinimaRecomendada;

    public Genero(String pnombre, int pedadMinimaRecomendada) {
        this.nombre = pnombre;
        this.edadMinimaRecomendada = pedadMinimaRecomendada;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public int getEdadMinimaRecomendada() {
        return this.edadMinimaRecomendada;
    }

    public void setEdadMinimaRecomendada(int pedadMinimaRecomendada) {
        this.edadMinimaRecomendada = pedadMinimaRecomendada;
    }
}

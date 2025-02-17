package POO.EJ1JAVA;

public class Genero {
    private String nombre;
    private int edadMinimaRecomendada;

    public Genero(String nombre, int edadMinimaRecomendada) {
        this.nombre = nombre;
        this.edadMinimaRecomendada = edadMinimaRecomendada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadMinimaRecomendada() {
        return edadMinimaRecomendada;
    }

    public void setEdadMinimaRecomendada(int edadMinimaRecomendada) {
        this.edadMinimaRecomendada = edadMinimaRecomendada;
    }
}

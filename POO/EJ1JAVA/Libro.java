package POO.EJ1JAVA;

public class Libro {
    private String titulo;
    private int anioPublicacion;
    private int numeroPaginas;
    private Genero genero;
    private String sinopsis;
    private Autora autora;

    public Libro(String titulo, int anioPublicacion, int numeroPaginas, Genero genero, String sinopsis, Autora autora) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.autora = autora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Autora getAutora() {
        return autora;
    }

    public void setAutora(Autora autora) {
        this.autora = autora;
    }
}
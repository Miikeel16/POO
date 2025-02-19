package POO.EJ1JAVA;

public class Libro {
    private String titulo;
    private int anioPublicacion;
    private int numeroPaginas;
    private Genero genero;
    private String sinopsis;
    private Autora autora;

    public Libro(String ptitulo, int panioPublicacion, int pnumeroPaginas, Genero pgenero, String psinopsis, Autora pautora) {
        this.titulo = ptitulo;
        this.anioPublicacion = panioPublicacion;
        this.numeroPaginas = pnumeroPaginas;
        this.genero = pgenero;
        this.sinopsis = psinopsis;
        this.autora = pautora;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String ptitulo) {
        this.titulo = ptitulo;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = panioPublicacion;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = pnumeroPaginas;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = pgenero;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }
    

    public void setSinopsis(String sinopsis) {
        this.sinopsis = psinopsis;
    }

    public Autora getAutora() {
        return this.autora;
    }

    public void setAutora(Autora autora) {
        this.autora = pautora;
    }
}
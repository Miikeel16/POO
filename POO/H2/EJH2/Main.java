package POO.H2.EJH2;

public class Main {
    public static void main(String[] args) {

        AtletaNatacion nadador = new AtletaNatacion("Michael Phelps", "EE.UU.", 35, "Nadador", 12, "Mariposa");
        AtletaAtletismo corredor = new AtletaAtletismo("Usain Bolt", "Jamaica", 37, "Corredor", 11, "100m");
        AtletaGimnasia gimnasta = new AtletaGimnasia("Simone Biles", "EE.UU.", 26, "Ritmica", 4, "Aro");
        AtletaCiclismo ciclista = new AtletaCiclismo("Egan Bernal", "Colombia", 27, "Ciclismo", 5, "Specialized");

        nadador.ganarMedalla("oro");
        nadador.mejorarMarca(1.55);
        nadador.cambiarDisciplina("Waterpolo");

        corredor.ganarMedalla("plata");
        corredor.mejorarMarca(9.85);
        corredor.cambiarDisciplina("400m");

        gimnasta.ganarMedalla("bronce");
        gimnasta.mejorarMarca(15.3);
        gimnasta.cambiarDisciplina("Barras asimétricas");

        ciclista.ganarMedalla("oro");
        ciclista.mejorarMarca(45.7);
        ciclista.cambiarDisciplina("BMX");
    }
}

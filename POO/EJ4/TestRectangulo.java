package POO.EJ4;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestRectangulo {

    Rectangulo rectangulo = new Rectangulo(2, 3, 6, 7);
    

    @Test
    public void testCalcularSuperficie() {
        assertEquals(12, rectangulo.calcularSuperficie());
    }
    @Test
    public void testCalcularPerimetro() {
        assertEquals(14, rectangulo.calcularSuperficie());
    }
    @Test
    public void testDesplazar() {
        rectangulo.desplazar(2, 3);
        assertEquals(14, rectangulo.calcularSuperficie());
    }
    @Test
    public void testNumeroDeRectangulos(){
        assertTrue(rectangulo.getNumeroDeRectangulos() > 0);
    }

}

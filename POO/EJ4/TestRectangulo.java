package POO.EJ4;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRectangulo {

    Rectangulo rectangulo = new Rectangulo(2, 3, 6, 7);
    

    @Test
    public void testCalcularSuperficie() {
        assertEquals(16.0, rectangulo.calcularSuperficie(),0.01);
    }
    @Test
    public void testCalcularPerimetro() {
        assertEquals(16, rectangulo.calcularSuperficie(),0.01);
    }
    @Test
    public void testDesplazar() {
        rectangulo.desplazar(2, 3);
        assertEquals(16, rectangulo.calcularSuperficie(),0.01);
    }
    @Test
    public void testNumeroDeRectangulos(){
        assertTrue(Rectangulo.getNumeroDeRectangulos() > 0);
    }

}

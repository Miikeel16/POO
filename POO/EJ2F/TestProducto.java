package POO.EJ2F;

import static org.junit.Assert.*;
import org.junit.Test;
public class TestProducto {
    Producto producto = new Producto("Audi", 14000, 21);
    @Test
    public void testCalcularPrecioFinal(){
        assertEquals(16093.0, producto.calcularPrecioFinal(), 0.01);
    }
    @Test
    public void testNoCalcularPrecioFinal(){
        assertNotEquals(15093.0, producto.calcularPrecioFinal(), 0.01);
    }
}

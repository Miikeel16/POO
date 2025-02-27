package POO.EJ3F;

import static org.junit.Assert.*;

import java.beans.Transient;
import jdk.jfr.Timestamp;

import org.junit.Test;

public class TestEmpleado {
    Empleado E1 = new Empleado("Mikel", 1400, 12);

    @Test

    public void testCalcularBono(){
        assertEquals(3240, E1.calcularBono(), 0.01);
    }
    @Test
    public void testNoCalcularBono(){
        assertNotEquals(3140, E1.calcularBono(), 0.01);
    }
}

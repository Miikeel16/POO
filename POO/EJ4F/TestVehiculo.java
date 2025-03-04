package POO.EJ4F;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestVehiculo {
    Vehiculo v1= new Vehiculo("Audi", "A4", 5, 150);

    @Test
    public void testCalcularAutonomia(){
        assertEquals(30.0, v1.calcularAutonomia(),0.01);
    }
    @Test
    public void testNoCalcularAutonomia(){
        assertNotEquals(32.0, v1.calcularAutonomia(),0.01);
    }
}

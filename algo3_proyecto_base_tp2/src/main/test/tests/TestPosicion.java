package tests;


import clases_tp.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPosicion {

    @Test
    public void TestPosicion1()
    {
        Posicion posicion1 = new Posicion(2, 4);
        assertEquals(2, posicion1.getX());
    }
}

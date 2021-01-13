package tests;

import clases_tp.Linea;
import clases_tp.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class TestLinea {
    @Test
    public void TestLinea1()
    {
        Posicion posicion1 = new Posicion(2, 4);
        Posicion posicion2 = new Posicion(2, 5);
        Linea linea1 = new Linea(posicion1, posicion2);
        Assert.assertEquals(posicion1, linea1.getCom());
    }

}

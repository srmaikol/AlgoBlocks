package tests;


import clases_tp.*;
import org.junit.Assert;
import org.junit.Test;


public class TestPosicion {

    @Test
    public void TestPosicion1()
    {
        Posicion posicion1 = new Posicion(2, 4);
        Assert.assertEquals(2, posicion1.getX());
    }
}

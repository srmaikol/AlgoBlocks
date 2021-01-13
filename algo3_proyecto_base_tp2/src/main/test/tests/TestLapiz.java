package tests;

import clases_tp.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestLapiz {
    Dibujo dibujo;
    Posicion pos1 = new Posicion(0, 0);
    Posicion pos2 = new Posicion(0, 1);
    Posicion pos3 = new Posicion(1, 1);

    @Before
    public void setUp() {
        dibujo = new Dibujo();
    }

    @Test
    public void TestLapizAbajoCreaLineaEnDibujo() {

        Lapiz lapiz = new LapizAbajo();
        lapiz.dibujar(dibujo, pos1, pos2);

        Linea linea1 = new Linea(pos1, pos2);
        Set<Linea> lineas = new HashSet<Linea>();
        lineas.add(linea1);

        Assert.assertEquals(dibujo.getLineas(),lineas);
    }

}

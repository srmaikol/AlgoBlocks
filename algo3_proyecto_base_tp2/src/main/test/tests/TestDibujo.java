package tests;

import clases_tp.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestDibujo {
    @Test
    public void TestAgregarLineas(){
        Dibujo dibujo1 = new Dibujo();
        Posicion pos1 = new Posicion(0,0);
        Posicion pos2 = new Posicion(0,1);
        Posicion pos3 = new Posicion(1,1);

        Linea linea1 = new Linea(pos1, pos2);
        dibujo1.agregarLinea(linea1);

        Linea linea2 = new Linea(pos2, pos3);
        dibujo1.agregarLinea(linea2);


        Set<Linea> aver = new HashSet<Linea>();
        aver.add(linea1);
        aver.add(linea2);

        Assert.assertEquals(dibujo1.getLineas(), aver);
    }
}
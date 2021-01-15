package tests;

import clases_tp.*;
import org.junit.Assert;
import org.junit.Test;

public class TestAlgoBlocksBloqueInvertir {

    @Test
    public void testAlgoritmoConBloqueInvertirDibujaLoEsperado() {
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarBloque(new BloqueBajarLapiz());

        BloqueInvertir invertido = new BloqueInvertir();
        invertido.agregarBloque(new BloqueDerecha());
        invertido.agregarBloque(new BloqueAbajo());

        algoBlocks.agregarBloque(invertido);

        algoBlocks.ejecutar();
        Assert.assertEquals("[0 0 -1 0, -1 0 -1 1]", algoBlocks.getLineas().toString());
        //    System.out.println(algoBlocks.getDibujo().getLineas().toString());
    }
}

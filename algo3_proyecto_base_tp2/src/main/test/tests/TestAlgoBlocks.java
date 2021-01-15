package tests;
import clases_tp.*;

import org.junit.Assert;
import org.junit.Test;

public class TestAlgoBlocks {

    @Test
    public void testAlgoritmoDibujaLoEsperado(){
        AlgoBlocks algoBlocks = new AlgoBlocks();

        algoBlocks.agregarBloque(new BloqueBajarLapiz());
        algoBlocks.agregarBloque(new BloqueDerecha());
        algoBlocks.agregarBloque(new BloqueAbajo());

        algoBlocks.ejecutar();
        Assert.assertEquals("[0 0 1 0, 1 0 1 -1]", algoBlocks.getLineas().toString());
    }

}

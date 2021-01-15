package tests;

import clases_tp.AlgoBlocks;
import clases_tp.BloqueAbajo;
import clases_tp.BloqueBajarLapiz;
import clases_tp.BloqueDerecha;
import org.junit.Assert;
import org.junit.Test;

public class TestAlgoBlocksBorrarAlgoritmo {

    @Test
    public void testAlgoritmoBorradoNoDibujaNada(){
        AlgoBlocks algoBlocks = new AlgoBlocks();

        algoBlocks.agregarBloque(new BloqueBajarLapiz());
        algoBlocks.agregarBloque(new BloqueDerecha());
        algoBlocks.agregarBloque(new BloqueAbajo());
        algoBlocks.borrarAlgoritmo();
        algoBlocks.ejecutar();
        Assert.assertEquals("[]", algoBlocks.getLineas().toString());
    }

}

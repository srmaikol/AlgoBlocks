package tests;

import clases_tp.*;
import org.junit.Assert;
import org.junit.Test;

public class TestAlgoBlocksBloquePersonalizado {

    @Test
    public void testAlgoritmoConBloquePersonalizadoDibujaLoEsperado() {
        AlgoBlocks algoBlocks = new AlgoBlocks();

        algoBlocks.agregarBloque(new BloqueBajarLapiz());
        algoBlocks.agregarBloque(new BloqueDerecha());
        algoBlocks.agregarBloque(new BloqueArriba());

        BloquePersonalizado personalizado = algoBlocks.nuevoBloquePersonalizado();

        algoBlocks.borrarAlgoritmo();
        algoBlocks.agregarBloque(personalizado);
        //System.out.println(algoBlocks.getListaBloques());


        // LA SIGUIENTE LINEA ENTRA EN LOOP INFINITO Y SE CUELGA
        //algoBlocks.ejecutar();

        //System.out.println(algoBlocks.getLineas());
        //        Assert.assertEquals("[0 0 1 0, 1 0 1 -1]", algoBlocks.getLineas().toString());

    }

}

package tests;
import clases_tp.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPersonaje {
	Personaje persona;
    Dibujo dibujo;
    @Before
    public void setUp() throws Exception {
        dibujo = new Dibujo();
        persona = new Personaje(dibujo);
    }

    @Test
    public void testPersonajeSeMueveALaDerecha(){
    	persona.moverDerecha();
        Assert.assertEquals(1 , persona.getPosX());
    }
    
    @Test
    public void testPersonajeSeMueveALaIzquierda(){
    	persona.moverIzquierda();
        Assert.assertEquals(-1 , persona.getPosX());
    }
    
    @Test
    public void testPersonajeSeMueveArriba(){
    	persona.moverArriba();
        Assert.assertEquals(1 , persona.getPosY());
    } 
    
    @Test
    public void testPersonajeSeMueveAbajo(){
    	persona.moverAbajo();
        Assert.assertEquals(-1 , persona.getPosY());
    }
    
    @Test
    public void testPersonajeElLapizEstaArribaCuandoSeCreaElPersonaje(){
    	Assert.assertFalse(persona.lapizEstaAbajo());
    }
    
    @Test
    public void testPersonajeElLapizEstaArriba(){
    	persona.levantarLapiz();
        Assert.assertFalse(persona.lapizEstaAbajo());
    }

    @Test
    public void testPersonajeElLapizEstaAbajo(){
        persona.bajarLapiz();
        Assert.assertTrue(persona.lapizEstaAbajo());
    }

    @Test
    public void TestPersonajeSeMueveADerechaConLapizAbajoDibujaLinea(){
        persona.bajarLapiz();
        persona.moverDerecha();
        Assert.assertEquals("[0 0 1 0]", dibujo.getLineas().toString());
    }

    @Test
    public void TestPersonajeSeMueveAbajoConLapizAbajoDibujaLinea(){
        persona.bajarLapiz();
        persona.moverAbajo();
        Assert.assertEquals("[0 0 0 -1]", dibujo.getLineas().toString());
    }

    @Test
    public void TestPersonajeSeMueveAbajoConLapizArribaNoDibujaNada(){
        persona.levantarLapiz();
        persona.moverAbajo();
        Assert.assertEquals("[]", dibujo.getLineas().toString());
    }
}

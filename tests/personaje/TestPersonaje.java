package tests.personaje;
import clases_tp.Personaje;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPersonaje {
	Personaje persona;

    @Before
    public void setUp() throws Exception {
        persona =new Personaje();
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
    	
        Assert.assertEquals("arriba" , persona.getPosicionLapiz());
    }
    
    @Test
    public void testPersonajeElLapizEstaArriba(){
    	persona.levantarLapiz();
        Assert.assertEquals("arriba" , persona.getPosicionLapiz());
    }
    
    @Test
    public void testPersonajeElLapizEstaAbajo(){
    	persona.bajarLapiz();
        Assert.assertEquals("abajo" , persona.getPosicionLapiz());
    }
}

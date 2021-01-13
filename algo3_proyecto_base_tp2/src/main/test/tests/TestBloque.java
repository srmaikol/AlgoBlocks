package tests;

import clases_tp.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestBloque {
	Dibujo dibujo;
	Personaje persona;

	@Before
    public void setUp() throws Exception {
        dibujo = new Dibujo();
		persona = new Personaje(dibujo);
    }
	
	@Test
	public void testBloqueDerechaMuevePersonajeALaDerecha(){
    	BloqueDerecha bloque = new BloqueDerecha();
    	bloque.mover(persona);
        Assert.assertEquals(1 , persona.getPosX());
    }
	
	@Test
    public void testBloqueDerechaMuevePersonajeALaDerechaVariasVeces(){
    	BloqueDerecha bloque = new BloqueDerecha();
    	bloque.mover(persona);
    	bloque.mover(persona);
    	bloque.mover(persona);
        Assert.assertEquals(3 , persona.getPosX());
    }
	
	@Test
	public void testBloqueIzquierdaMuevePersonajeALaIzquierda(){
		BloqueIzquierda bloque = new BloqueIzquierda();
    	bloque.mover(persona);
        Assert.assertEquals(-1 , persona.getPosX());
    }
	
	@Test
    public void testBloqueIzquierdaMuevePersonajeALaIzquierdaVariasVeces(){
		BloqueIzquierda bloque = new BloqueIzquierda();
    	bloque.mover(persona);
    	bloque.mover(persona);
    	bloque.mover(persona);
        Assert.assertEquals(-3 , persona.getPosX());
    }
	
	@Test
	public void testBloqueArribaMuevePersonajeArriba(){
		BloqueArriba bloque = new BloqueArriba();
    	bloque.mover(persona);
        Assert.assertEquals(1 , persona.getPosY());
    }
	
	@Test
    public void testBloqueArribaMuevePersonajeArribaVariasVeces(){
		BloqueArriba bloque = new BloqueArriba();
    	bloque.mover(persona);
    	bloque.mover(persona);
    	bloque.mover(persona);
        Assert.assertEquals(3 , persona.getPosY());
    }
	
	@Test
	public void testBloqueAbajoMuevePersonajeAbajo(){
		BloqueAbajo bloque = new BloqueAbajo();
    	bloque.mover(persona);
        Assert.assertEquals(-1 , persona.getPosY());
    }
	
	@Test
    public void testBloqueAbajoMuevePersonajeAbajoVariasVeces(){
		BloqueAbajo bloque = new BloqueAbajo();
    	bloque.mover(persona);
    	bloque.mover(persona);
    	bloque.mover(persona);
        Assert.assertEquals(-3 , persona.getPosY());
    }
	
	@Test
	public void testBloqueSubirLapizLevantaElLapiz(){
		BloqueLevantarLapiz bloque = new BloqueLevantarLapiz();
    	bloque.levantar(persona);
		Assert.assertFalse(persona.lapizEstaAbajo());
    }
	
	@Test
	public void testBloqueBajarLapizBajaElLapiz(){
		BloqueBajarLapiz bloque = new BloqueBajarLapiz();
    	bloque.bajar(persona);
		Assert.assertTrue(persona.lapizEstaAbajo());
    }
}

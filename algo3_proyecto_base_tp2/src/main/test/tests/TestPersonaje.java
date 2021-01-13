package tests;
import clases_tp.Dibujo;
import clases_tp.Linea;
import clases_tp.Personaje;
import clases_tp.Posicion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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
        Set prueba = setDePrueba(0,0,1,0);

        Assert.assertEquals(prueba, dibujo.getLineas());

    }

    @Test
    public void TestPersonajeSeMueveAbajoConLapizAbajoDibujaLinea(){
        persona.bajarLapiz();
        persona.moverAbajo();
        Set prueba = setDePrueba(0,0,0, -1);
        Assert.assertEquals(prueba, dibujo.getLineas());
    }

    @Test
    public void TestPersonajeSeMueveAbajoConLapizArribaNoDibujaNada(){
        persona.levantarLapiz();
        persona.moverAbajo();
        Set vacio = new HashSet<>();
        Assert.assertEquals(vacio, dibujo.getLineas());
    }

    // método auxiliar, crea un set con una línea para comparar con el dibujo
    public Set setDePrueba(int x, int y, int x2, int y2){
        Posicion pos1 = new Posicion(x, y);
        Posicion pos2 = new Posicion(x2, y2);
        Linea linea = new Linea(pos1, pos2);
        Set<Linea> setDePrueba = new HashSet<Linea>();
        setDePrueba.add(linea);
        return setDePrueba;
    }

}

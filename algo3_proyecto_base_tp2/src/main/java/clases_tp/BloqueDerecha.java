package clases_tp;

public class BloqueDerecha implements Bloque {

    public void ejecutar(Personaje persona) {
        persona.moverDerecha();
    }

    public void ejecutarInvertido(Personaje persona) {
        persona.moverIzquierda();
    }


}

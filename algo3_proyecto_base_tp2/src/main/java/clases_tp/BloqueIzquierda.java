package clases_tp;

public class BloqueIzquierda implements Bloque {

    public void ejecutar(Personaje persona) {
        persona.moverIzquierda();
    }

    public void ejecutarInvertido(Personaje persona) {
        persona.moverDerecha();
    }


}

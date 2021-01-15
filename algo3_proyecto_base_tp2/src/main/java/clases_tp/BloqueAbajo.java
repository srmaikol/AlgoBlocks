package clases_tp;

public class BloqueAbajo implements Bloque {

    public void ejecutar(Personaje persona) {
        persona.moverAbajo();
    }

    public void ejecutarInvertido(Personaje persona) {
        persona.moverArriba();
    }
}

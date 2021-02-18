package clases_tp;

public class BloqueArriba implements Bloque {

    public void ejecutar(Personaje persona) {
        persona.mover(0, 1);
    }

    public void ejecutarInvertido(Personaje persona) {
        persona.mover(0, -1);
    }


}

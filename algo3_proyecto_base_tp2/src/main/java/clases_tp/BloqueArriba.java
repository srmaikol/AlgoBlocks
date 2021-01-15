package clases_tp;

public class BloqueArriba implements Bloque {

    public void ejecutar(Personaje persona) {
        persona.moverArriba();
    }

    public void ejecutarInvertido(Personaje persona) {
        persona.moverAbajo();
    }


}

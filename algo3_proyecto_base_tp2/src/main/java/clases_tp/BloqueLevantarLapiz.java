package clases_tp;

public class BloqueLevantarLapiz implements Bloque {

    public void ejecutar(Personaje persona) {
        persona.levantarLapiz();
    }

    public void ejecutarInvertido(Personaje persona) {
        persona.bajarLapiz();
    }


}

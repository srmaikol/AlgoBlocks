package clases_tp;

public class BloqueLevantarLapiz extends Bloque {

	@Override
	public void mover(Personaje persona) {}
	@Override
	public void levantar(Personaje persona) {
		
		persona.levantarLapiz();
	}

	@Override
	public void bajar(Personaje persona) {}

}

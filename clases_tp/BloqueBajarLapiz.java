package clases_tp;

public class BloqueBajarLapiz extends Bloque {

	@Override
	public void mover(Personaje persona) {}

	@Override
	public void levantar(Personaje persona) {}

	@Override
	public void bajar(Personaje persona) {
		
		persona.bajarLapiz();
	}

}

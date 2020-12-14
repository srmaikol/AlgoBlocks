package clases_tp;

public class BloqueAbajo extends Bloque {

	public void mover(Personaje persona) {
		
		persona.moverAbajo();
	}

	@Override
	public void levantar(Personaje persona) {}

	@Override
	public void bajar(Personaje persona) {}

}

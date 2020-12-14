package clases_tp;

public class BloqueIzquierda extends Bloque {

	@Override
	public void mover(Personaje persona) {
		
		persona.moverIzquierda();
	}
	
	@Override
	public void levantar(Personaje persona) {}

	@Override
	public void bajar(Personaje persona) {}

}

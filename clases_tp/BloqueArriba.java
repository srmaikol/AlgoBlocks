package clases_tp;

public class BloqueArriba extends Bloque {

	@Override
	public void mover(Personaje persona) {
		
		persona.moverArriba();
	}
	
	@Override
	public void levantar(Personaje persona) {}

	@Override
	public void bajar(Personaje persona) {}

}

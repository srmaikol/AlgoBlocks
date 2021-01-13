package clases_tp;

public class BloqueDerecha extends Bloque {

	public void mover(Personaje persona) {
		
		persona.moverDerecha();
	}
	
	@Override
	public void levantar(Personaje persona) {}

	@Override
	public void bajar(Personaje persona) {}

}

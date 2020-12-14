package clases_tp;

public class Personaje {
	private int posX = 0, posY = 0;
	private String posicionLapiz = "arriba";
	
public void moverDerecha() {
		
		posX += 1;
	}
	public int getPosX() {
		
		return posX;
	}
	public void moverIzquierda() {
		
		posX -= 1;
	}
	public void moverArriba() {
		
		posY += 1;
	}
	public int getPosY() {

		return posY;
	}
	public void moverAbajo() {

		posY -= 1;
	}
	public void levantarLapiz() {
		
		posicionLapiz = "arriba";
	}
	public String getPosicionLapiz() {
		
		return posicionLapiz;
	}
	public void bajarLapiz() {

		posicionLapiz = "abajo";
	}
}

package clases_tp;

public class Personaje {
    private Lapiz lapiz = new LapizArriba();
    private Posicion pos = new Posicion(0, 0);
    private Dibujo dibujo;

    public Personaje(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    public void moverDerecha() {
        Posicion pos2 = new Posicion(pos.getX() + 1, pos.getY());
        lapiz.dibujar(dibujo, pos, pos2);
        pos = pos2;
    }

    public int getPosX() {
        return pos.getX();
    }

    public void moverIzquierda() {
        Posicion pos2 = new Posicion(pos.getX() - 1, pos.getY());
        lapiz.dibujar(dibujo, pos, pos2);
        pos = pos2;
    }

    public void moverArriba() {
        Posicion pos2 = new Posicion(pos.getX(), pos.getY() + 1);
        lapiz.dibujar(dibujo, pos, pos2);
        pos = pos2;
    }

    public int getPosY() {
		return pos.getY();
    }

    public void moverAbajo() {
        Posicion pos2 = new Posicion(pos.getX(), pos.getY() - 1);
        lapiz.dibujar(dibujo, pos, pos2);
        pos = pos2;
    }

    public void levantarLapiz() {
        lapiz = new LapizArriba();
    }

    public Boolean lapizEstaAbajo(){
    	return lapiz.estaAbajo();
	}

    public void bajarLapiz() {
        lapiz = new LapizAbajo();
    }
}

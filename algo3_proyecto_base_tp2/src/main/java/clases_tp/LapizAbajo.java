package clases_tp;

public class LapizAbajo implements Lapiz {
    public void dibujar(Dibujo dibujo, Posicion com, Posicion fin) {
        Linea linea= new Linea(com,fin);
        dibujo.agregarLinea(linea);
    }
    public boolean estaAbajo(){
        return true;
    }
}

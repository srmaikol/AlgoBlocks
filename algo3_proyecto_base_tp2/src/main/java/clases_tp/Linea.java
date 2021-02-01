package clases_tp;

import java.util.Objects;

public class Linea {
    private Posicion com;
    private Posicion fin;

    public Linea(Posicion pos1, Posicion pos2) {
        com = pos1;
        fin = pos2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linea linea = (Linea) o;
        return com.equals(linea.com) &&
                fin.equals(linea.fin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(com, fin);
    }

    // PARA EL TESTING
    @Override
    public String toString() {
        return com.getX() + " " + com.getY() + " " + fin.getX() + " " + fin.getY();
    }
}
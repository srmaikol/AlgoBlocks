package clases_tp;

import java.util.Objects;

public class Linea {
    private Posicion com;
    private Posicion fin;

    public Linea(Posicion pos1, Posicion pos2) {
    com=pos1;
    fin=pos2;
    }

    public Posicion getCom(){
        return com;
    }
    public Posicion getFin(){
        return fin;
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
}

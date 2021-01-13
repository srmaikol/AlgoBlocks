package clases_tp;

import java.util.HashSet;
import java.util.Set;

public class Dibujo {
    private Set<Linea> lineas = new HashSet<Linea>();

    public void agregarLinea(Linea linea){
        lineas.add(linea);
    }
    public Set getLineas(){
        return lineas;
    }
}

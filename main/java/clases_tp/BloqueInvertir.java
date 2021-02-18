package clases_tp;

import java.util.ArrayList;

public class BloqueInvertir implements Bloque, ConjuntoBloques {
    private ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();

    public void agregarBloque(Bloque bloque) {
        listaBloques.add(bloque);
    }

    public void ejecutar(Personaje persona) {
        listaBloques.forEach(bloque -> bloque.ejecutarInvertido(persona));
    }

    public void ejecutarInvertido(Personaje persona) {
        listaBloques.forEach(bloque -> bloque.ejecutar(persona));
    }

    @Override
    public void modificarConjuntoActual(ConjuntoBloques conjuntoActual, ConjuntoBloques nuevoConjunto) {

    }
}

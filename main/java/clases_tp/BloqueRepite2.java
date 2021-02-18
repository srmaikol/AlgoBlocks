package clases_tp;

import java.util.ArrayList;

public class BloqueRepite2 implements Bloque, ConjuntoBloques {
    private ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();

    public void agregarBloque(Bloque bloque) {
        listaBloques.add(bloque);
    }

    public void ejecutar(Personaje persona) {
        for (int i = 1; i <= 2; i++) {
            listaBloques.forEach(bloque -> bloque.ejecutar(persona));
        }
    }

    public void ejecutarInvertido(Personaje persona) {
        ejecutar(persona);
    }

    @Override
    public void modificarConjuntoActual(ConjuntoBloques conjuntoActual, ConjuntoBloques nuevoConjunto) {

    }
}

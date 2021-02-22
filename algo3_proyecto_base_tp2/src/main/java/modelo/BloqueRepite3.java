package modelo;

import java.util.ArrayList;

public class BloqueRepite3 implements Bloque ,ConjuntoBloques {
    private ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();

    public void agregarBloque(Bloque bloque) {
        listaBloques.add(bloque);
    }

    public void ejecutar(Personaje persona) {
        for (int i = 1; i <= 3; i++) {
            listaBloques.forEach(bloque -> bloque.ejecutar(persona));
        }
    }

    public void ejecutarInvertido(Personaje persona) {
        ejecutar(persona);
    }

}

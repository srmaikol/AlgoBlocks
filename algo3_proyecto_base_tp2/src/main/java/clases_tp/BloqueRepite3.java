package clases_tp;

import java.util.ArrayList;
import java.util.List;

public class BloqueRepite3 implements Bloque {
    private List<Bloque> listaBloques = new ArrayList<Bloque>();

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

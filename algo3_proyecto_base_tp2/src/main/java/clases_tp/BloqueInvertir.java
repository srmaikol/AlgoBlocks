package clases_tp;

import java.util.ArrayList;
import java.util.List;

public class BloqueInvertir implements Bloque {
    private List<Bloque> listaBloques = new ArrayList<Bloque>();

    public void agregarBloque(Bloque bloque) {
        listaBloques.add(bloque);
    }

    public void ejecutar(Personaje persona) {
        listaBloques.forEach(bloque -> bloque.ejecutarInvertido(persona));
    }

    public void ejecutarInvertido(Personaje persona) {
        listaBloques.forEach(bloque -> bloque.ejecutar(persona));
    }


}

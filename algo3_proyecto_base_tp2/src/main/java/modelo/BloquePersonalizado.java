package modelo;

import java.util.ArrayList;
import java.util.List;

public class BloquePersonalizado implements Bloque, ConjuntoBloques {

    private List<Bloque> listaBloquesPersonalizada = new ArrayList<Bloque>();

    public BloquePersonalizado(List<Bloque> listaBloques) {
        listaBloquesPersonalizada.addAll(listaBloques);
    }

    public void ejecutar(Personaje persona) {
        listaBloquesPersonalizada.forEach(bloque -> bloque.ejecutar(persona));
    }

    public void ejecutarInvertido(Personaje persona) {
        listaBloquesPersonalizada.forEach(bloque -> bloque.ejecutarInvertido(persona));
    }

    @Override
    public void agregarBloque(Bloque bloque) {

    }
}

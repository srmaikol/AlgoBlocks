package clases_tp;

import java.util.ArrayList;
import java.util.List;

public class BloquePersonalizado implements Bloque {

    private List<Bloque> listaBloquesPersonalizada = new ArrayList<Bloque>();

    public BloquePersonalizado(List<Bloque> listaBloques) {
        listaBloquesPersonalizada = listaBloques;
        //System.out.println(listaBloquesPersonalizada);
    }

    public void ejecutar(Personaje persona) {
        listaBloquesPersonalizada.forEach(bloque -> bloque.ejecutar(persona));
    }

    public void ejecutarInvertido(Personaje persona) {
        listaBloquesPersonalizada.forEach(bloque -> bloque.ejecutarInvertido(persona));
    }
}

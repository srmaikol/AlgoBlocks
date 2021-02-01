package clases_tp;

import java.util.ArrayList;
import java.util.Set;

public class AlgoBlocks {
    private ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();
    private Dibujo dibujo = new Dibujo();
    private Personaje persona = new Personaje(dibujo);


    public void agregarBloque(Bloque bloque) {
        listaBloques.add(bloque);
    }

    public void ejecutar() {
        listaBloques.forEach(bloque -> bloque.ejecutar(persona));
    }

    public BloquePersonalizado crearBloquePersonalizado() {
        return new BloquePersonalizado(listaBloques);
    }

    public void borrarAlgoritmo() {
        listaBloques.clear();
    }

    // para el testing y para hacer luego el dibujo con la interface grafica
    public Set getLineas() {
        return dibujo.getLineas();
    }

}

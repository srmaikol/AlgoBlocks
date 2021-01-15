package clases_tp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AlgoBlocks {
    private List<Bloque> listaBloques = new ArrayList<Bloque>();
    private Dibujo dibujo = new Dibujo();
    private Personaje persona = new Personaje(dibujo);


    public void agregarBloque(Bloque bloque) {
        listaBloques.add(bloque);
    }

    public void ejecutar() {
        listaBloques.forEach(bloque -> bloque.ejecutar(persona));
    }

    // para uso del BloquePersonalizado

    public BloquePersonalizado nuevoBloquePersonalizado(){
        return new BloquePersonalizado(listaBloques);
    }

    public void borrarAlgoritmo(){
        listaBloques.clear();
    }

    // para el testing
    public Set getLineas() {
        return dibujo.getLineas();
    }

    public List<Bloque> getListaBloques() {
        return listaBloques;
    }
}

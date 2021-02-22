package modelo;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;

public class AlgoBlocks implements ConjuntoBloques {
    private ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();
    private Dibujo dibujo = new Dibujo();
    private Personaje persona = new Personaje(dibujo);
    private BloquePersonalizado bloquePersonalizado = new BloquePersonalizado(listaBloques);

    public void resetPos(){
        persona.resetPosicion();
    }


    public void agregarBloque(Bloque bloque) {
        listaBloques.add(bloque);
    }

    public void ejecutar() {
        listaBloques.forEach(bloque -> bloque.ejecutar(persona));
    }

    public BloquePersonalizado crearBloquePersonalizado() {
        bloquePersonalizado = new BloquePersonalizado(listaBloques);
        return bloquePersonalizado;
    }

    public BloquePersonalizado getBloquePersonalizado() {
        return bloquePersonalizado;
    }

    public void borrarAlgoritmo() {

        listaBloques.clear();
        persona.levantarLapiz();
    }

    public void borrarDibujo(){
        dibujo.getLineas().clear();
        resetPos();
    }

    public Set<Linea> getLineas() {
        return dibujo.getLineas();
    }

}

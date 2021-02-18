package clases_tp;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;

public class AlgoBlocks implements ConjuntoBloques {
    private ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();
    private Dibujo dibujo = new Dibujo();
    private Personaje persona = new Personaje(dibujo);
    private Stack<Bloque> pilaCiclos = new Stack<>();

    public void resetPos(){
        persona.resetPosicion();
    }

    public Bloque agregarCiclo(Bloque bloque){
        pilaCiclos.add(bloque);
        return bloque;
    }

    public Bloque cerrarCiclo(){
        return pilaCiclos.pop();
    }

    @Override
    public void modificarConjuntoActual(ConjuntoBloques conjuntoActual, ConjuntoBloques nuevoConjunto) {

    }

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
    public Set<Linea> getLineas() {
        return dibujo.getLineas();
    }

}

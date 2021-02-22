package vista;

import controller.BotonBorrarHandler;
import controller.BotonPersonalizadoHandler;
import controller.BotonRunHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modelo.AlgoBlocks;
import modelo.Bloque;
import modelo.ConjuntoBloques;

import java.util.Stack;

public class PanelAlgoritmoView extends VBox {
    VBox bloquesAlgoritmo;
    ConjuntoBloques conjuntoActual;
    ConjuntoBloques algoBlocks;
    private Stack<ConjuntoBloques> pilaCiclos = new Stack<>();


    public PanelAlgoritmoView(AlgoBlocks algoBlocks, ConjuntoBloques conjuntoActual, PanelDibujoView panelDibujo) {
        this.conjuntoActual = conjuntoActual;
        this.algoBlocks = algoBlocks;
        this.pilaCiclos.push(algoBlocks);

        //TITULO
        Label tituloAlgoritmoGeneral = new Label("Algoritmo");
        tituloAlgoritmoGeneral.setStyle("-fx-font: 24 arial;");

        //BOTONERA
        Button buttonRun = new Button("Run");
        buttonRun.setOnAction(new BotonRunHandler(algoBlocks, panelDibujo));

        Button buttonBorrar = new Button("Borrar todo");
        buttonBorrar.setOnAction(new BotonBorrarHandler(algoBlocks, panelDibujo, this));

        Button buttonPersonalizado = new Button("Guardar Macro");
        buttonPersonalizado.setOnAction(new BotonPersonalizadoHandler(algoBlocks));


        HBox botonera = new HBox(buttonRun, buttonBorrar, buttonPersonalizado);
        botonera.setAlignment(Pos.TOP_CENTER);

        //BLOQUES DEL ALGORITMO
        bloquesAlgoritmo = new VBox();
        bloquesAlgoritmo.setStyle("-fx-border-color: black");
        bloquesAlgoritmo.setAlignment(Pos.TOP_CENTER);

        this.getChildren().add(tituloAlgoritmoGeneral);
        this.getChildren().add(botonera);
        this.getChildren().add(bloquesAlgoritmo);
        this.setStyle("-fx-border-color: black");
        this.setStyle("-fx-background-color: lightgreen");
        this.setMinWidth(200);
        this.setMinHeight(500);
        this.setAlignment(Pos.TOP_CENTER);
    }

    public void agregarBloque(Button bloque) {
        bloquesAlgoritmo.getChildren().add(bloque);
    }

    public void borrar() {
        bloquesAlgoritmo.getChildren().clear();
    }

    public void setConjuntoActual(ConjuntoBloques conjuntoActual) {
        this.conjuntoActual = conjuntoActual;
    }

    public ConjuntoBloques getConjuntoActual(){
        return conjuntoActual;
    }

    public void resetConjuntoActual() {
        this.conjuntoActual = algoBlocks;
    }

    public void agregarCiclo(ConjuntoBloques bloque){
        pilaCiclos.add(bloque);
    }

    public ConjuntoBloques cerrarCiclo(){
        pilaCiclos.pop();
        return pilaCiclos.firstElement();
    }

}



package controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import modelo.AlgoBlocks;
import modelo.BloquePersonalizado;
import vista.PanelAlgoritmoView;
import vista.PanelDibujoView;

public class BotonPersonalizadoHandler implements EventHandler {
    private AlgoBlocks algoBlocks;
    private PanelDibujoView panelDibujo;
    private PanelAlgoritmoView panelAlgoritmo;

    public BotonPersonalizadoHandler(AlgoBlocks algoBlocks) {
        this.algoBlocks = algoBlocks;
    }

    @Override
    public void handle(Event event) {
        algoBlocks.crearBloquePersonalizado();
    }
}

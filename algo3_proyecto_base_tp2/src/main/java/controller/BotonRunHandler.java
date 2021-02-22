package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Line;
import modelo.AlgoBlocks;
import modelo.Linea;
import vista.PanelDibujoView;

public class BotonRunHandler implements EventHandler<ActionEvent> {
    private AlgoBlocks algoBlocks;
    private PanelDibujoView panelDibujo;

    public BotonRunHandler(AlgoBlocks algoBlocks, PanelDibujoView panelDibujo) {
        this.algoBlocks = algoBlocks;
        this.panelDibujo = panelDibujo;
    }

    public void handle(ActionEvent event) {
        panelDibujo.borrar();
        algoBlocks.getLineas().clear();
        algoBlocks.resetPos();
        algoBlocks.ejecutar();

        Integer xInicial = 350;
        Integer yInicial = 250;

        for (Linea linea : algoBlocks.getLineas()) {

            Integer x0 = linea.getCoordenadas().get(0) * 100+xInicial;
            Integer y0 = linea.getCoordenadas().get(1) * (-100)+yInicial;
            Integer x1 = linea.getCoordenadas().get(2) * 100+xInicial;
            Integer y1 = linea.getCoordenadas().get(3) * (-100)+yInicial;

            Line lineaADibujar = new Line(x0, y0, x1, y1);
            panelDibujo.agregarLinea(lineaADibujar);

        }


    }
}

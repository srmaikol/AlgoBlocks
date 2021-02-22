package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import modelo.*;
import vista.PanelAlgoritmoView;


public class BotonesPanelBloquesHandler {
    private PanelAlgoritmoView panelAlgoritmo;


    public BotonesPanelBloquesHandler(AlgoBlocks algoBlocks,PanelAlgoritmoView panelAlgoritmo, Button[] boton ) {
        this.panelAlgoritmo = panelAlgoritmo;

        boton[1].setOnAction(value -> {
            panelAlgoritmo.getConjuntoActual().agregarBloque(new BloqueBajarLapiz());
            panelAlgoritmo.agregarBloque(new Button("Bajar Lapiz"));
        });

        boton[2].setOnAction(value -> {
            panelAlgoritmo.getConjuntoActual().agregarBloque(new BloqueLevantarLapiz());
            panelAlgoritmo.agregarBloque(new Button("Subir Lapiz"));
        });

        boton[3].setOnAction(value -> {
            panelAlgoritmo.getConjuntoActual().agregarBloque(new BloqueArriba());
            panelAlgoritmo.agregarBloque(new Button("Arriba"));
        });

        boton[4].setOnAction(value -> {
            panelAlgoritmo.getConjuntoActual().agregarBloque(new BloqueAbajo());
            panelAlgoritmo.agregarBloque(new Button("Abajo"));
        });

        boton[5].setOnAction(value -> {
            panelAlgoritmo.getConjuntoActual().agregarBloque(new BloqueIzquierda());
            panelAlgoritmo.agregarBloque(new Button("Izquierda"));
        });

        boton[6].setOnAction(valor -> {
            panelAlgoritmo.getConjuntoActual().agregarBloque(new BloqueDerecha());
            panelAlgoritmo.agregarBloque(new Button("Derecha"));
        });


        boton[7].setOnAction(value -> {
            BloqueInvertir invertido = new BloqueInvertir();
            panelAlgoritmo.getConjuntoActual().agregarBloque(invertido);
            panelAlgoritmo.agregarBloque(new Button("Invertir"));
            panelAlgoritmo.setConjuntoActual(invertido);
            panelAlgoritmo.agregarCiclo(invertido);
        });

        boton[8].setOnAction(value -> {
            BloqueRepite2 bloqueRepite2 = new BloqueRepite2();
            panelAlgoritmo.getConjuntoActual().agregarBloque(bloqueRepite2);
            panelAlgoritmo.agregarBloque(new Button("Repite 2"));
            panelAlgoritmo.setConjuntoActual(bloqueRepite2);
            panelAlgoritmo.agregarCiclo(bloqueRepite2);
        });

        boton[9].setOnAction(value -> {
            BloqueRepite3 bloqueRepite3 = new BloqueRepite3();
            panelAlgoritmo.getConjuntoActual().agregarBloque(bloqueRepite3);
            panelAlgoritmo.agregarBloque(new Button("Repite 3"));
            panelAlgoritmo.setConjuntoActual(bloqueRepite3);
            panelAlgoritmo.agregarCiclo(bloqueRepite3);
                    });

        boton[10].setOnAction(value -> {
            //panelAlgoritmo.resetConjuntoActual();
            panelAlgoritmo.agregarBloque(new Button("Cerrar ciclo Actual"));
            panelAlgoritmo.setConjuntoActual(panelAlgoritmo.cerrarCiclo());
        });

        boton[11].setOnAction(value -> {
            BloquePersonalizado personalizado = algoBlocks.getBloquePersonalizado() ;
            panelAlgoritmo.getConjuntoActual().agregarBloque(personalizado);
            panelAlgoritmo.agregarBloque(new Button("Run Macro"));
        });


    }

}


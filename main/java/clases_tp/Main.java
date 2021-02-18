package clases_tp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("AlgoBlocks");
        AlgoBlocks algoBlocks = new AlgoBlocks();
        ConjuntoBloques conjuntoActual = algoBlocks;

        //FXMLLoader loader = new FXMLLoader();
        //loader.setLocation(new URL("file:///C:/Users/Baires/Dropbox/Algo III/tp2/TP2-Algo3/algo3_proyecto_base_tp2/src/main/java/clases_tp/javafx.fxml"));
        //loader.setLocation(new URL("file:///C:/home/sofi/Tp2-Algo3/algo3_proyecto_base_tp2/src/main/java/clases_tp/javafx.fxml"));
        //loader.setLocation(new URL("file:///C:/home/sofi/Tp2-Algo3/openjfx-11.0.2_linux-x64_bin-sdk/javafx-sdk-11.0.2/lib"));

        // Creacion de paneles de bloque, algoritmo y dibujo

        Label tituloBloques = new Label("Bloques");
        VBox panelBloques = new VBox(tituloBloques);
        panelBloques.setStyle("-fx-border-color: #000000");


        Label tituloAlgoritmoGeneral = new Label("Algoritmo");
        VBox panelAlgoritmo = new VBox();
        VBox panelAlgoritmoGeneral = new VBox(tituloAlgoritmoGeneral, panelAlgoritmo);
        panelAlgoritmo.setStyle("-fx-border-color: black");
        panelAlgoritmoGeneral.setStyle("-fx-border-color: black");

        Label tituloDibujo = new Label("Dibujo");
        Button buttonRun = new Button("Run");
        Pane dibujoSolo = new Pane();
        VBox panelDibujo = new VBox(tituloDibujo, buttonRun, dibujoSolo);
        panelDibujo.setStyle("-fx-border-color: black");





        // Botones para crear algoritmo y sus funcionalidades

        Button button1 = new Button("Bajar Lapiz");
        button1.setOnAction(value -> {
            conjuntoActual.agregarBloque(new BloqueBajarLapiz());
            panelAlgoritmo.getChildren().add(new Button("Bajar Lapiz"));
        });

        Button button2 = new Button("Subir Lapiz");
        button2.setOnAction(value -> {
            conjuntoActual.agregarBloque(new BloqueLevantarLapiz());
            panelAlgoritmo.getChildren().add(new Button("Subir Lapiz"));
        });

        Button button3 = new Button("Arriba");
        button3.setOnAction(value -> {
            conjuntoActual.agregarBloque(new BloqueArriba());
            panelAlgoritmo.getChildren().add(new Button("Arriba"));
        });

        Button button4 = new Button("Abajo");
        button4.setOnAction(value -> {
            conjuntoActual.agregarBloque(new BloqueAbajo());
            panelAlgoritmo.getChildren().add(new Button("Abajo"));
        });

        Button button5 = new Button("Izquierda");
        button5.setOnAction(value -> {
            conjuntoActual.agregarBloque(new BloqueIzquierda());
            panelAlgoritmo.getChildren().add(new Button("Izquierda"));
        });

        Button button6 = new Button("Derecha");
        button6.setOnAction(valor -> {
            conjuntoActual.agregarBloque(new BloqueDerecha());
            panelAlgoritmo.getChildren().add(new Button("Derecha"));
        });


        //Botones Especiales


        Button button7 = new Button("Invertir");
        button7.setOnAction(value -> {
            BloqueInvertir invertido = new BloqueInvertir();
            conjuntoActual.agregarBloque(invertido);
            algoBlocks.agregarCiclo(invertido);
            conjuntoActual.modificarConjuntoActual(conjuntoActual, invertido );
            panelAlgoritmo.getChildren().add(new Button("Invertir"));
        });

        Button button8 = new Button("Repite 2");
        button8.setOnAction(value -> {
            algoBlocks.agregarBloque(new BloqueRepite2());
            panelAlgoritmo.getChildren().add(new Button("Repite 2"));
        });

        Button button9 = new Button("Repite 3");
        button9.setOnAction(value -> {
            algoBlocks.agregarBloque(new BloqueRepite3());
            panelAlgoritmo.getChildren().add(new Button("Repite 3"));
        });

        Button button10 = new Button("Cerrar ciclo Actual");
        button10.setOnAction(value -> {
            //conjuntoActual = algoBlocks.cerrarCiclo();
            panelAlgoritmo.getChildren().add(new Button("Cerrar ciclo Actual"));
        });


        Button button11 = new Button("Algoritmo Personalizado");
        button11.setOnAction(value -> {
            //algoBlocks.agregarBloque(new BloquePersonalizado());
            panelAlgoritmo.getChildren().add(new Button("Algoritmo Personalizado"));
        });


        Button button12 = new Button("Borrar todo");
        button12.setOnAction(value -> {
            panelAlgoritmo.getChildren().clear();
            dibujoSolo.getChildren().clear();
            algoBlocks.borrarAlgoritmo();
            algoBlocks.getLineas().clear();
            algoBlocks.resetPos();
        });



        // Agregamos los botones a la interfaz

        panelBloques.getChildren().add(button1);
        panelBloques.getChildren().add(button2);
        panelBloques.getChildren().add(button3);
        panelBloques.getChildren().add(button4);
        panelBloques.getChildren().add(button5);
        panelBloques.getChildren().add(button6);
        panelBloques.getChildren().add(button7);
        panelBloques.getChildren().add(button8);
        panelBloques.getChildren().add(button9);
        panelBloques.getChildren().add(button10);
        panelBloques.getChildren().add(button11);
        panelBloques.getChildren().add(button12);



        buttonRun.setOnAction(value -> {
            dibujoSolo.getChildren().clear();
            algoBlocks.ejecutar();

            Integer xInicial = 100;
            Integer yInicial = 100;

            for (Linea linea : algoBlocks.getLineas()) {

                Integer x0 = linea.getCoordenadas().get(0) * 100+xInicial;
                Integer y0 = linea.getCoordenadas().get(1) * (-100)+yInicial;
                Integer x1 = linea.getCoordenadas().get(2) * 100+xInicial;
                Integer y1 = linea.getCoordenadas().get(3) * (-100)+yInicial;

                Line lineaADibujar = new Line(x0, y0, x1, y1);
                dibujoSolo.getChildren().add(lineaADibujar);
            }

            algoBlocks.borrarAlgoritmo();



        });


        HBox hbox = new HBox( panelBloques,panelAlgoritmoGeneral,panelDibujo);
        Scene scene = new Scene(hbox, 1400, 700);
        //scene.getStylesheets().add("estilos.css");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}


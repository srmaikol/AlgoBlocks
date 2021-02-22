package vista;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import modelo.Linea;

import static java.lang.Thread.sleep;

public class PanelDibujoView extends VBox{
    Pane dibujoSolo;

    public PanelDibujoView() {
        Label tituloDibujo = new Label("Dibujo");
        tituloDibujo.setStyle("-fx-font: 24 arial;");
        dibujoSolo = new Pane();
        this.getChildren().add(tituloDibujo);
        this.getChildren().add(dibujoSolo);
        this.setMinWidth(700);
        this.setStyle("-fx-border-color: black");
        this.setStyle("-fx-background-color: lightblue");
        this.setAlignment(Pos.TOP_CENTER);
    }

    public void borrar(){
        dibujoSolo.getChildren().clear();
    }

    public void agregarLinea(Line linea){
        dibujoSolo.getChildren().add(linea);
// pausa entre el dibujo de cada linea, no funca
 /*       try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dibujoSolo.requestLayout();
   */

    }


}

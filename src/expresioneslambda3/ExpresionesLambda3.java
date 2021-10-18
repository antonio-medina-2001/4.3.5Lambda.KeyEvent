
package expresioneslambda3;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import javafx.stage.Stage;

/**
 *
 * @author 34616
 */
public class ExpresionesLambda3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 250);
        
        Text texto = new Text(20,20,"A");
        pane.getChildren().add(texto);
        
        texto.setOnKeyPressed(new EventHandler<KeyEvent>() {
        public void handle(KeyEvent event) {
            if(event.getCode()== KeyCode.DOWN)
                texto.setY(texto.getY()+10);
            if(event.getCode()== KeyCode.UP)
                texto.setY(texto.getY()-10);
            if(event.getCode()== KeyCode.RIGHT)
                texto.setX(texto.getX()+10);
            if(event.getCode()== KeyCode.LEFT)
                texto.setX(texto.getX()-10);
        }
        });
        
        primaryStage.setTitle("ExpresionesLambda, EJ3");
        primaryStage.setScene(scene);
        primaryStage.show();
        texto.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

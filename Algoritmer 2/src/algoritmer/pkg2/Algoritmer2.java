/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmer.pkg2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author christofferstrandarnesen
 */
public class Algoritmer2 extends Application {
    
    
    
    protected final int WIDTH = 1000; 
    protected final int HEIGHT = 630; 
    
    BorderPane root;
    HBox høyre;
    
    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();
        root = new BorderPane();
        høyre = new HBox();
        høyre.setStyle("-fx-background-color: pink;");
        høyre.setPrefWidth(150);
        høyre.setSpacing(10);
        høyre.setPadding(new Insets(10,10,10,10));
        
        root.setRight(høyre);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        primaryStage.setTitle("AVL-Tre");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

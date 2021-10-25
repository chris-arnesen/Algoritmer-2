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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author christofferstrandarnesen
 */
public class Algoritmer2 extends Application {
    
    
    
    protected final int WIDTH = 1000; 
    protected final int HEIGHT = 630; 
    protected final int VBox_WIDTH = 250;
    
    BorderPane root;
    VBox høyre;
    
    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();
        root = new BorderPane();
        høyre = new VBox();
        TextField input = new TextField();
        Button srcBtn = new Button("Search for value");
        Button deleteBtn = new Button("Delete value");
        Button insertBtn = new Button("Insert value");
        
        høyre.getChildren().addAll(input, srcBtn, deleteBtn, insertBtn);
        
        høyre.setStyle("-fx-background-color: pink; -fx-border-color: black;");
        høyre.setPrefWidth(VBox_WIDTH);
        høyre.setSpacing(10);
        høyre.setPadding(new Insets(10,10,10,10));
        
        root.setRight(høyre);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        
        
        primaryStage.setTitle("AVL-Tre");
        primaryStage.setScene(scene);
        primaryStage.show();
        srcBtn.setPrefWidth(høyre.getWidth());
        deleteBtn.setPrefWidth(høyre.getWidth());
        insertBtn.setPrefWidth(høyre.getWidth());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

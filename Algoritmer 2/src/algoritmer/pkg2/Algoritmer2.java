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
import javafx.scene.layout.Pane;
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
        høyre = new VBox();
        TextField input = new TextField();
        Button srcBtn = new Button("Search for value");
        Button deleteBtn = new Button("Delete value");
        Button insertBtn = new Button("Insert value");
        Button randomValuesBtn = new Button("Insert random values"); //Vet ikke hva jeg skal kalle de her, eller skrive på dem
        Button findValueNrBtn = new Button("Find value nr");  // samme her
        høyre.getChildren().addAll(input, srcBtn, deleteBtn, insertBtn, randomValuesBtn, findValueNrBtn);
        
        høyre.setStyle("-fx-background-color: pink; -fx-border-color: black;");
        høyre.setPrefWidth(VBox_WIDTH);
        høyre.setSpacing(10);
        høyre.setPadding(new Insets(10,10,10,10));
        
        root.setRight(høyre);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        BST<Integer> tree = new BST<>();
        
        BTView view = new BTView(tree);
        
        root.setCenter(view);
        
        
        primaryStage.setTitle("AVL-Tre");
        primaryStage.setScene(scene);
        primaryStage.show();
        srcBtn.setPrefWidth(høyre.getWidth());
        deleteBtn.setPrefWidth(høyre.getWidth());
        insertBtn.setPrefWidth(høyre.getWidth());
        randomValuesBtn.setPrefWidth(høyre.getWidth());
        findValueNrBtn.setPrefWidth(høyre.getWidth());
        
        srcBtn.setStyle("-fx-background-color: rgb(240,240,240);");
        deleteBtn.setStyle("-fx-background-color: rgb(230,230,230);");
        insertBtn.setStyle("-fx-background-color: rgb(220,220,220);");
        randomValuesBtn.setStyle("-fx-background-color: rgb(210,210,210);");
        findValueNrBtn.setStyle("-fx-background-color: rgb(200,200,200);");
        
        insertBtn.setOnAction(e -> {
            int key = Integer.parseInt(input.getText());
            if (tree.search(key)) {
                view.displayTree();
                view.setStatus(key + "er alerede i treet");
            } else {
                tree.insert(key);
                view.displayTree();
                view.setStatus(key + "er satt inn i treet");
            }
        }
        );
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

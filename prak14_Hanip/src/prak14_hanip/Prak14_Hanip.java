/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak14_hanip;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Praktikan
 */
public class Prak14_Hanip extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Hamzah Hanif - 2117051032");
        
//        Button btn = new Button("Click Me!");
//        Label txt = new Label(" ");
//        
//        btn.setOnAction(new EventHandler<ActionEvent>(){
//
//            @Override
//            public void handle(ActionEvent event) {
//               txt.setText("Hello World!");
//            }
//            
//        });
        
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.getChildren().add(txt);
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root);
//        
//        stage.setHeight(300);
//        stage.setWidth(300);
//        stage.setScene(scene);
//        stage.setTitle("Hamzah Hanif - 2117051032");
//        stage.show();
//
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

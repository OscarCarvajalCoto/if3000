/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.ui;


import static java.awt.SystemColor.text;

import java.util.stream.IntStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author oandr
 */
public class ContactForm extends Application {
    private TextField name= new TextField();
    private TextField lastName= new TextField();
    private DatePicker dateOfBirth= new DatePicker();
   private Button addButton = new Button("Agregar");
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label nameLabel = new Label ("Nombre");
       Label lastNameLabel = new Label ("Apellido");
       Label dateOfBirthLabel = new Label("Fecha de Nacimiento");

       GridPane form=buildForm(
               nameLabel,name,
               lastNameLabel,lastName,
               dateOfBirthLabel,dateOfBirth,
               addButton
       );
        Scene scene = new Scene(form,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    private GridPane buildForm(Control...controls){
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        IntStream.range(0,controls.length)
                .forEach(index ->
                    grid.add(
                            controls[index], index % 2, index / 2, 1, 1)
                );


        return grid;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

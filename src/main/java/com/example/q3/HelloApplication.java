package com.example.q3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.paint.Color;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox pane = new HBox(10);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setAlignment(Pos.CENTER);
        //Text text = new Text("Java");
        double j;

            Text text1 = new Text("Java");
            text1.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            text1.setFill( new Color( 0.3421,0.8634,0.123,0.363 ));
            text1.setRotate(90);
            pane.getChildren().add(text1);
        Text text2 = new Text("Java");
        text2.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text2.setFill( new Color( 0.3421,0.8634,0.123,0.463 ));
        text2.setRotate(90);
        pane.getChildren().add(text2);
        Text text3 = new Text("Java");
        text3.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text3.setFill( new Color( 0.3421,0.8634,0.123,0.563 ));
        text3.setRotate(90);
        pane.getChildren().add(text3);
        Text text4 = new Text("Java");
        text4.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text4.setFill( new Color( 0.3421,0.8634,0.123,0.663 ));
        text4.setRotate(90);
        pane.getChildren().add(text4);
        Text text5 = new Text("Java");
        text5.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text5.setFill( new Color( 0.3421,0.8634,0.123,0.763 ));
        text5.setRotate(90);
        pane.getChildren().add(text5);



        Scene scene = new Scene(pane, 300, 100);
        stage.setTitle("Exercise 14_01");
        stage.setOpacity(0.9);
        stage.setScene(scene);
        stage.show();}
        public static void main (String [] args){
            launch();
        }
     }
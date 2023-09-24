package com.example.flags;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage){
        GridPane pane= new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        ImageView imageView1 = new ImageView("/src/main/resources/image/uk.gif");
        ImageView imageView2 = new ImageView("/src/main/resources/image/ca.gif");
        ImageView imageView3 = new ImageView("/src/main/resources/image/china.gif");
        ImageView imageView4 = new ImageView("/src/main/resources/image/us.gif");
        pane.add(imageView1, 0, 0);
        pane.add(imageView2, 1, 0);
        pane.add(imageView3, 0, 1);
        pane.add(imageView4, 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ex14_1");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

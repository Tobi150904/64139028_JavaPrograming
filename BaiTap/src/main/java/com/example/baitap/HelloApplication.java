package com.example.baitap;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        Circle body = new Circle(200, 230, 50);
        body.setFill(Color.WHITE);
        body.setStroke(Color.BLACK);

        Circle foot1 = new Circle(170, 280, 20);
        foot1.setFill(Color.WHITE);
        foot1.setStroke(Color.BLACK);

        Circle foot2 = new Circle(230, 280, 20);
        foot2.setFill(Color.WHITE);
        foot2.setStroke(Color.BLACK);

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
                200.0, 100.0,
                150.0, 200.0,
                250.0, 200.0
        });
        triangle.setFill(Color.WHITE);
        triangle.setStroke(Color.BLACK);

        Polygon redTriangle = new Polygon();
        redTriangle.getPoints().addAll(new Double[]{
                200.0, 160.0,
                190.0, 140.0,
                210.0, 140.0
        });
        redTriangle.setFill(Color.RED);

        root.getChildren().addAll(body, foot1, foot2, triangle, redTriangle);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
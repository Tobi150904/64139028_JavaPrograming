package com.example.baitap;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private Group shapesGroup;

    @Override
    public void start(Stage primaryStage) {
        shapesGroup = new Group();

        Button drawButton = new Button("Vẽ");
        drawButton.setOnAction(event -> drawShapes());

        VBox vbox = new VBox(20, drawButton);
        vbox.setAlignment(javafx.geometry.Pos.CENTER);

        StackPane root = new StackPane(vbox, shapesGroup);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawShapes() {
        shapesGroup.getChildren().clear();

        Circle body = new Circle(200, 230, 50);
        body.setFill(Color.WHITE);
        body.setStroke(Color.BLACK);

        Circle foot1 = new Circle(170, 280, 20);
        foot1.setFill(Color.WHITE);
        foot1.setStroke(Color.BLACK);

        Circle foot2 = new Circle(230, 280, 20);
        foot2.setFill(Color.WHITE);
        foot2.setStroke(Color.BLACK);

        Arc redArc1 = new Arc(170, 280, 15, 15, 135, 100);
        redArc1.setFill(Color.TRANSPARENT);
        redArc1.setStroke(Color.RED);
        redArc1.setType(ArcType.OPEN);

        Arc redArc2 = new Arc(230, 280, 15, 15, 135, 100);
        redArc2.setFill(Color.TRANSPARENT);
        redArc2.setStroke(Color.RED);
        redArc2.setType(ArcType.OPEN);

        Arc redArc3 = new Arc(170, 280, 15, 15, 315, 100);
        redArc3.setFill(Color.TRANSPARENT);
        redArc3.setStroke(Color.RED);
        redArc3.setType(ArcType.OPEN);

        Arc redArc4 = new Arc(230, 280, 15, 15, 315, 100);
        redArc4.setFill(Color.TRANSPARENT);
        redArc4.setStroke(Color.RED);
        redArc4.setType(ArcType.OPEN);

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
                200.0, 110.0,
                130.0, 200.0,
                270.0, 200.0
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

        Polygon leftEar = new Polygon();
        leftEar.getPoints().addAll(new Double[]{
                176.0, 100.0,
                192.0, 120.0,
                176.0, 140.0
        });
        leftEar.setFill(Color.WHITE);
        leftEar.setStroke(Color.BLACK);

        Polygon rightEar = new Polygon();
        rightEar.getPoints().addAll(new Double[]{
                224.0, 100.0,
                208.0, 120.0,
                224.0, 140.0
        });
        rightEar.setFill(Color.WHITE);
        rightEar.setStroke(Color.BLACK);

        shapesGroup.getChildren().addAll(body, foot1, foot2, redArc1, redArc2, redArc3, redArc4, triangle, redTriangle, leftEar, rightEar);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
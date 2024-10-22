package com.example.caro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CaroApp extends Application {

    private Button[][] board = new Button[3][3];
    private boolean isXTurn = true; // Lượt đi của X

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        // Tạo các ô (nút) cho bảng Caro
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                button.setPrefSize(100, 100);
                int row = i, col = j;
                button.setOnAction(e -> handleMove(button, row, col));
                grid.add(button, j, i);
                board[i][j] = button;
            }
        }

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle("Caro 3x3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Xử lý khi người chơi nhấn vào một ô
    private void handleMove(Button button, int row, int col) {
        if (button.getText().isEmpty()) {
            button.setText(isXTurn ? "X" : "O");
            isXTurn = !isXTurn;
            checkWin();
        }
    }

    // Kiểm tra kết quả thắng/thua
    private void checkWin() {
        // Logic kiểm tra thắng/thua có thể thêm vào đây
    }

    public static void main(String[] args) {
        launch(args);
    }
}

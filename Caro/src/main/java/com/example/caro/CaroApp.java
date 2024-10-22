package com.example.caro;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CaroApp extends Application {

    private char[][] board = new char[3][3];
    private char currentPlayer = 'X';
    private boolean gameOver = false;
    private Text statusText; // Declare statusText here

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);

        // Create buttons for the Caro board
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button btn = new Button();
                btn.setPrefSize(100, 100);
                btn.setFont(Font.font("Arial", FontWeight.BOLD, 36));
                final int r = row, c = col; // Local variable for lambda
                btn.setOnAction(e -> handleClick(btn, r, c));
                grid.add(btn, col, row);
            }
        }

        // Initialize and add statusText to the grid
        statusText = new Text("Current Player: " + currentPlayer);
        statusText.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        grid.add(statusText, 0, 3, 3, 1);

        Scene scene = new Scene(grid, 320, 300);
        primaryStage.setTitle("Caro 3x3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleClick(Button btn, int row, int col) {
        if (gameOver || board[row][col] != '\0') return; // Do not allow clicking on an occupied cell
        board[row][col] = currentPlayer;
        btn.setText(String.valueOf(currentPlayer));
        if (checkWin(currentPlayer)) {
            statusText.setText("Player " + currentPlayer + " wins!");
            gameOver = true;
        } else if (isBoardFull()) {
            statusText.setText("It's a draw!");
            gameOver = true;
        } else {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Change player turn
            statusText.setText("Current Player: " + currentPlayer);
        }
    }

    private boolean checkWin(char player) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\0') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package com.example.caro;

@RestController
@RequestMapping("/api/game")
public class CaroController {

    @PostMapping("/check-win")
    public String checkWin(@RequestBody char[][] board) {

        if (hasWon(board, 'X')) {
            return "X wins!";
        } else if (hasWon(board, 'O')) {
            return "O wins!";
        }
        return "No winner yet!";
    }

    private boolean hasWon(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
}

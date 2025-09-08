// Board.java
public class Board {
    private char[][] grid;

    public Board() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                grid[i][j] = ' '; // vazio
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (row < 0 || row > 2 || col < 0 || col > 2 || grid[row][col] != ' ') {
            return false; // jogada inválida
        }
        grid[row][col] = symbol;
        return true;
    }

    public char checkWinner() {
        // linhas
        for (int i = 0; i < 3; i++)
            if (grid[i][0] != ' ' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2])
                return grid[i][0];

        // colunas
        for (int j = 0; j < 3; j++)
            if (grid[0][j] != ' ' && grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j])
                return grid[0][j];

        // diagonais
        if (grid[0][0] != ' ' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2])
            return grid[0][0];

        if (grid[0][2] != ' ' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0])
            return grid[0][2];

        return ' '; // ninguém ganhou ainda
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i][j] == ' ')
                    return false;
        return true;
    }
}

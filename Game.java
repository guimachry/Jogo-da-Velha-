// Game.java
import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(Player p1, Player p2) {
        this.board = new Board();
        this.player1 = p1;
        this.player2 = p2;
        this.currentPlayer = player1;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ") - sua vez!");
            System.out.print("Informe linha (0-2): ");
            int row = sc.nextInt();
            System.out.print("Informe coluna (0-2): ");
            int col = sc.nextInt();

            if (!board.makeMove(row, col, currentPlayer.getSymbol())) {
                System.out.println("Jogada inválida, tente novamente.");
                continue;
            }

            char winner = board.checkWinner();
            if (winner != ' ') {
                board.printBoard();
                System.out.println("Parabéns " + currentPlayer.getName() + "! Você venceu!");
                break;
            } else if (board.isFull()) {
                board.printBoard();
                System.out.println("Empate!");
                break;
            }

            switchPlayer();
        }

        sc.close();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}

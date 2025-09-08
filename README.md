
Implementação do clássico jogo da velha utilizando **Java** com foco em **orientação a objetos**.  
O projeto foi estruturado para separar bem as responsabilidades, tornando fácil a manutenção, testes e evolução do código.

## 🧩 Estrutura de Classes

```mermaid
classDiagram
    class Main {
        +main(String[] args)
    }
    class Game {
        -Board board
        -Player player1
        -Player player2
        -Player currentPlayer
        +start()
        -switchPlayer()
    }
    class Board {
        -char[][] grid
        +printBoard()
        +makeMove(int row, int col, char symbol) boolean
        +checkWinner() char
        +isFull() boolean
    }
    class Player {
        -String name
        -char symbol
        +getName() String
        +getSymbol() char
    }
    Main --> Game
    Game --> Board
    Game --> Player
🚀 Como Executar
Compile os arquivos .java:

bash
Mostrar sempre detalhes

Copiar código
javac Main.java
Execute a aplicação:

bash
Mostrar sempre detalhes

Copiar código
java Main
✨ Principais Características
Estrutura em classes bem definida (Board, Player, Game, Main)

Lógica de jogo desacoplada da interface (atualmente jogável via console, mas pronta para ser adaptada para GUI ou Web)

Fácil de expandir para suportar IA ou outros modos de jogo

🛠️ Tecnologias Utilizadas
Java 17+ (compatível com versões anteriores)

Estrutura simples sem dependências externas

🎯 Objetivo Educacional
Este projeto foi desenvolvido para fins de estudo, praticando conceitos de POO, boas práticas de código e organização de projetos Java.

package application;

import chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception 
    {
        ChessMatch match = new ChessMatch();
        UI.printBoard(match.getPieces());
    }
}

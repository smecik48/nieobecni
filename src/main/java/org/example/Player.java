package org.example;

public abstract class Player {
    Symbol symbol;
    Board board;
    abstract void playTurn();
    abstract void inform(String inf);

    public Symbol getSymbol() {
        return symbol;
    }
}

package org.example;

public abstract class Board {
    Symbol[][] matrix = new Symbol[3][3];

    public void setSymbol(Symbol symbol, int x, int y){
        this.matrix[x][y] = symbol;
    }

    abstract void start();
    abstract void playGame(Player one, Player two);
}

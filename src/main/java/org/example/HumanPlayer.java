package org.example;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private void showBoard(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println(this.board.matrix[i][j] + " ");
            }
            System.out.println("/n");
        }
    }

    private void listenInput(){
        Scanner sc = new Scanner(System.in);
        this.board.setSymbol(this.symbol, sc.nextInt(), sc.nextInt());
    }

    @Override
    void playTurn() {
        showBoard();
        listenInput();
    }

    @Override
    void inform(String inf) {
        System.out.println(inf);
    }
}

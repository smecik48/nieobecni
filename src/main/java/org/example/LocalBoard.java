package org.example;

public class LocalBoard extends Board{

    @Override
    void playGame(Player one, Player two) {
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                this.matrix[i][j] = Symbol.B;
            }
        }
        int [][] matrix_num = new int[3][3];
        int sumX = 0;
        int sumO = 0;
        boolean game = true;
        matrix_num[0][0] = 8;
        matrix_num[0][1] = 1;
        matrix_num[0][2] = 6;

        matrix_num[1][0] = 3;
        matrix_num[1][1] = 5;
        matrix_num[1][2] = 7;

        matrix_num[2][0] = 4;
        matrix_num[2][1] = 9;
        matrix_num[2][2] = 2;

        if(one.getSymbol() == two.getSymbol()){
            System.err.println("Same symbol for both players!");
        }
        while(game){
            one.playTurn();
            two.playTurn();
        }
    }
    @Override
    void start() {
        Player player1 = new HumanPlayer();
        Player player2 = new HumanPlayer();
        playGame(player1, player2);
    }
}

package game;

import coordinates.Coordinates;
import board.Board;
import player.Player;
import dice.Dice;
import jumper.Jumper;
import java.util.*;
public class Game {
    Board board;
    Player[] players;
    boolean[] isAllowed;
    int turn;
    Coordinates[] places;
    Dice dice;

    public Game(Board board, Player [] players, Dice dice ){
        this.board=board;
        this.players=players;
        this.dice=dice;
        turn=0;
        isAllowed= new boolean[players.length];
        places=new Coordinates[players.length];
        for(int i=0;i<players.length;i++){
            places[i]=new Coordinates(board.getBoardSize()-1,0);

        }

    }

    public void play(){
        Scanner sc=new Scanner(System.in);
        while(true){
            
            System.out.print(players[turn].getPlayerName()+" press 'y' to roll the dice: ");
            String input = sc.nextLine().trim().toLowerCase();
            if (!input.equals("y")) {
                System.out.println("Game aborted by the player.");
                return;
            }
            int num=dice.diceRoll();
            System.out.println(players[turn].getPlayerName()+" rolled -> "+num);
            

            if(!isAllowed[turn]){
                if(num!=1){
                    turn=1-turn;
                    continue;
                }
                else{
                    isAllowed[turn]=true;
                }
            }

            String currentPosition = getCurrentPositionString(turn);
            System.out.println(players[turn].getPlayerName() + " is at position: " + currentPosition);

            Coordinates newCoordinates=getNewCoordinates(places[turn],num);
            
            if(newCoordinates.getRow()<0){
                System.out.println(players[turn].getPlayerName()+" has won!");
                return;
            }
            

            places[turn]=newCoordinates;
            turn=1-turn;



        }
    }

    private Coordinates getNewCoordinates(Coordinates oldCoordinates,int num){
        int row=oldCoordinates.getRow();
        int col=oldCoordinates.getCol();

        while(num>0){
            if(row%2!=0){
                if(col==board.getBoardSize()-1) row--;
                else col++;
                

            }else{
                if(col==0) row--;
                else col--;

            }
            num--;
        }

        if(row<0) return new Coordinates(row, col);
        if(checkIfJumperExists(row,col)){
            Jumper jumper=board.jumpers.get(board.board[row][col]);

            return jumper.end;
            
        }
        return new Coordinates(row, col);
    }

    private String getCurrentPositionString(int turn) {
        Coordinates currentPos = places[turn];
        return board.board[currentPos.getRow()][currentPos.getCol()];
    }

    private boolean checkIfJumperExists(int row, int col){
            return board.jumpers.containsKey(board.board[row][col]);
}

}

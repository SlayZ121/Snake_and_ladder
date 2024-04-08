package game;

import coordinates.Coordinates;
import board.Board;
import player.Player;
import dice.Dice;
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
        while(true){
            int num=dice.diceRoll();
            System.out.println(players[turn].getPlayerName()+" rolled -> "+num+places[turn]);

            if(!isAllowed[turn]){
                if(num!=1){
                    turn=1-turn;
                    continue;
                }
                else{
                    isAllowed[turn]=true;
                }
            }

            Coordinates newCoordinates=getNewCoordinates(places[turn],num);



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
        if(checkIfJumperExists){
            
        }
    }



}

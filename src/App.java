import player.Player;
import jumper.Jumper;
import board.Board;
import java.util.*;
import game.Game;
import dice.Dice;
import coordinates.Coordinates;
public class App {
    public static void main(String[] args) throws Exception {

        HashMap<String, Jumper>  map=new HashMap<>();
        map.put("6", new Jumper(new Coordinates(9,5),new Coordinates(6, 6) ));
        map.put("97",new Jumper(new Coordinates(0,1), new Coordinates(9, 9)));
        map.put("21", new Jumper(new Coordinates(7,0), new Coordinates(0, 9)));
        map.put("64", new Jumper(new Coordinates(3,3), new Coordinates(7, 4)));
        
        Player p1=new Player();
        p1=p1.setPlayerDetailsFromUserInput();
        Player p2=new Player();
        p2=p2.setPlayerDetailsFromUserInput();
    

        System.out.println("Player name is: "+p1.getPlayerName());
        System.out.println("Player name is: "+p2.getPlayerName());

        Dice dice=new Dice();
        System.out.println(dice.diceRoll());

        Coordinates c=new Coordinates(9, 4);
        Coordinates d=new Coordinates(6, 7);
        System.out.println(c.printCoordinates());

        Jumper j=new Jumper(c,d);
        System.out.println(j.getJumperName());

        Board b=new Board(10,map);
        b.printBoard();

        Game game=new Game(b,new Player[]{p1,p2},new Dice());
        game.play();

    }
    
}

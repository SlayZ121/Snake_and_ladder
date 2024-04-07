import player.Player;
import dice.Dice;
import coordinates.Coordinates;
import jumper.Jumper;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
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

    }
    
}

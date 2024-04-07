import player.Player;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        Player p1=new Player();
        p1=p1.setPlayerDetailsFromUserInput();

        Player p2=new Player();

        p2=p2.setPlayerDetailsFromUserInput();
    

        System.out.println("Player name is: "+p1.getPlayerName());
        System.out.println("Player name is: "+p2.getPlayerName());
    }
    
}

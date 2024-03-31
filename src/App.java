import player.Player;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        Player p1=setPlayerDetailsFromUserInput();
        
        p1.getPlayerDetails();

        Player p2=setPlayerDetailsFromUserInput();
        System.out.println(p2.getPlayerName());
    }
    
    public static Player setPlayerDetailsFromUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details of the Player");
        System.out.println("Enter the name of the player");
        String name=sc.nextLine();
        System.out.println("Enter Player's contact number");
        String contactno=sc.nextLine();
        System.out.println("Enter Player's address");
        String address=sc.nextLine();
        System.out.println("Enter Player's Email iD");
        String email_id=sc.nextLine();
        System.out.println("Enter Player's age");
        int age=sc.nextInt();

        Player p=new Player();
        p.set_player_details(name,contactno, address, email_id, age);

        return p;

    }
}

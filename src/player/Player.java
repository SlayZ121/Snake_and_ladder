package player;

import java.util.Scanner;

public class Player {
      private String name;
      private String email_id;
      private String contactno;
      private String address;
      private int age;

     public void set_player_details(String name, String contactno, String address, String email_id, int age){
        this.name=name;
        this.age=age;
        this.contactno=contactno;
        this.address=address;
        this.email_id=email_id;

     
     }
     public void setPlayerName(String name){
        this.name=name;
     }
     public void getPlayerDetails(){
       System.out.println("The player's name: "+this.name);
       System.out.println("The player's age: "+this.age);
       System.out.println("The player's contact number: "+this.contactno);
       System.out.println("The player's email iD: "+this.email_id);
       System.out.println("The player's address: "+this.address);
     }
     public String getPlayerName(){
        return this.name;
     }

      public Player setPlayerDetailsFromUserInput(){
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

package player;

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
}

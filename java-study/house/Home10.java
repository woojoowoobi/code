package house;

public class Home10 {
    public static void main(String[] args) {
      Card c = new Card();
      c.kind = "HEART"; 
      c.number = 5; 
      c.width = 200;  // Card.width = 200;이 정석이다
      c.height = 300; // Card.height = 300;이 정석이다
        System.out.println(c.kind);
    }

}


class Card {
    
    
    String kind;  // iv (개별) (변해야하는값)
    int number;   // iv (개별) (변해야하는값)

    static int width = 100;  // cv = static을 붙인다 (공통) (변하지 않는값)
    static int height = 200; // cv = static을 붙인다 (공통) (변하지 않는값)

}

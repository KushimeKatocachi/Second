package GameDev;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Arnold" ,15 ,"Wairor" );
        Player player1 = new Player();


        Player player2 = new Player("Conor", 14 , "Archer" );
        player2.info();
        Player.info(player2);
        System.out.println(Player.playerCount);

    }
}

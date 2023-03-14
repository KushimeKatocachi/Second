package GameDev;

public class Player {
    public String name;
    public int level;
    public String playerclass;
    public static int playerCount;

    public Player(String name, int level, String playerclass) {
        this.name = name;
        this.level = level;
        this.playerclass = playerclass;
        playerCount++;
    }

    public Player(String name) {
        this.name = name;
        playerCount++;
    }

    public Player(int level) {
        this.level = level;
        playerCount++;
    }
    public Player() {
    }
    public Player(String name, int level) {
        this.name = name;
        this.level = level;
        playerCount++;
    }

    public Player(int level, String playerclass) {
        this.level = level;
        this.playerclass = playerclass;
        playerCount++;
    }

    public void info() {
        System.out.println("Info: " + this.name + this.level + this.playerclass);
    }
    public static void info(Player player) {
        System.out.println("Info: " + player.name + " " + player.level +" " +  player.playerclass);
    }
}

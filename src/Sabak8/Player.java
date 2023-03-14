package Sabak8;

public class Player {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("close", 500 , 100 , 75);
        warrior.attackAmount = 100;
        warrior.info();

        Mage mage = new Mage("distance" , 300 , 500 , 150);
        warrior.attack(mage);

        Potion hp1 = new Potion("health" , 500, "minor" , "blue");
        Potion hp2 = new Potion("health" , 50 , "minor" , "red");
        System.out.println(hp1 == hp2 );
        System.out.println(hp1.equals(hp2));
    }
}

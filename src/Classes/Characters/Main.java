package Classes.Characters;

import Classes.Dangeous.Dungeon;
import Classes.Party;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gendalf"), new Warrior("Aragor"),
                new Archer("Legalas"), new Healer("Lagalas"));
        party.info();
        Dungeon dungeon = new Dungeon();
        if(party.enterDungeon(dungeon)){
            party.setDungeon(dungeon);
            party.runDungeon();
        } else {
            System.out.println("Game Over");
        }
    }
}

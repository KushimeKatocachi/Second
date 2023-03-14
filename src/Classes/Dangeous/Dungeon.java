package Classes.Dangeous;

import Classes.Monsters.MonstarsClass;
import Classes.Party;

public class Dungeon implements BasicDungeon {
    private boolean isOpened = false;
    private MonstarsClass[] monstars;
    //for array, where all party members attack monsters
    @Override
    public boolean open(Party party) {
        if(party.getPartyMembers().length < 3) {
            System.out.println("No enough party members!");
            isOpened = false;
        } else {
            System.out.println("Welcome heroes! \n Get ready for the  adventure! ");
        }
        return isOpened;

    }
}

package Sabak8;

import Sabak5.Bird;

public class Main1 {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.attack();
        IFlyable flyable = new Dragon();
        IFlyable flyable1 = new Bird();
        IFlyable[] flyers = new IFlyable[2];
        flyers[0] = flyable;
        flyers[1] = flyable1;
        for (int i = 0; i < flyers.length; i++ )
            flyers[i].fly();
        }
    }


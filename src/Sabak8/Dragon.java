package Sabak8;

import Sabak5.Aggressive;

public class Dragon extends NPC implements IFlyable, Aggressive {
    @Override
    public void attack() {
        System.out.println("Dragon fireball");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}


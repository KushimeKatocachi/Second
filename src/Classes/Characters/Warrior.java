package Classes.Characters;

import Classes.CharacterClass;

import java.time.Year;

public class Warrior extends CharacterClass {
    public Warrior(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(500);
        this.setMaxManaPoints(200);
        this.setHealthpoints(100);
        this.setManapoints(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(5);

    }
}

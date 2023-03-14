package Classes.Characters;

import Classes.CharacterClass;

public class Healer extends CharacterClass {
    public Healer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(500);
        this.setMaxManaPoints(200);
        this.setHealthpoints(100);
        this.setManapoints(50);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(5);

    }
}

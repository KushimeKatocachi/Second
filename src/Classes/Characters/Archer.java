package Classes.Characters;

import Classes.CharacterClass;

public class Archer extends CharacterClass {
    public Archer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(500);
        this.setMaxManaPoints(200);
        this.setHealthpoints(100);
        this.setManapoints(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(5);

    }
}

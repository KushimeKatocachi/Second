package Classes.Monsters;

import Classes.Characters.AttackType;
import Sabak8.Mage;

public class Sceleton extends MonstarsClass {
    public Sceleton(String name) {
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

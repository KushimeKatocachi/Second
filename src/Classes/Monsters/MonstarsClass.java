package Classes.Monsters;

import Classes.BaseClass;
import Classes.Characters.AttackType;

public class MonstarsClass implements BaseClass {
    private int healthpoints;
    private int manapoints;
    private int level;
    private int attackAmount;

    private AttackType attackType;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;
    @Override
    public void attack(int amount) {

    }
    @Override
    public void restoreHealth(int amount) {

    }
    @Override
    public void loseHealth(int amount) {

    }
    @Override
    public void restoreMane(int amount) {

    }
    @Override
    public void loseMane(int amount) {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {
    }

    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }

    public int getManapoints() {
        return manapoints;
    }

    public void setManapoints(int manapoints) {
        this.manapoints = manapoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        this.attackAmount = attackAmount;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }
}

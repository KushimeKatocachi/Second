package Classes;

import Classes.Characters.AttackType;

public abstract class CharacterClass implements BaseClass{
    private int healthpoints;
    private int manapoints;
    private int level;
    private int attackAmount;

    private AttackType attackType;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;

    @Override
    public void attack(int amount){
    }

    @Override
    public void restoreHealth(int amount) {
        setHealthpoints(this.healthpoints + amount);
    }

    @Override
    public void loseHealth(int amount) {

        setManapoints(this.healthpoints - amount);
    }

    @Override
    public void restoreMane(int amount) {
        setManapoints((this.manapoints + amount));
    }

    @Override
    public void loseMane(int amount) {
        setManapoints(this.manapoints - amount);
    }

    @Override
    public void levelUp() {
    }

    @Override
    public void info() {
        System.out.println("Name: " + this.name + "\nCurrentHP: " + this.healthpoints + "\n CurrentMN: "
                + this.manapoints +  "\nCurrentLVL: " + this.level);
    }


    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        if(healthpoints < 0) this.healthpoints = 0;
        else if( healthpoints > this.maxHealthPoints) this.healthpoints = this.maxHealthPoints;
        else this.healthpoints = healthpoints;
    }

    public int getManapoints() {
        return manapoints;
    }

    public void setManapoints(int manapoints) {
        if(manapoints < 0) this.manapoints = 0;
        else if( manapoints > this.maxManaPoints) this.manapoints = this.maxManaPoints;
        else this.manapoints = manapoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if ( level < 0 ) System.out.println("You can't lose level! ");
        this.level = level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        if(attackAmount < 0 ) System.out.println("You can't have attack rate below zero!");
        else this.attackAmount = attackAmount;
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

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}

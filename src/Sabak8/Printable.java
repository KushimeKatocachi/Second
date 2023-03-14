package Sabak8;


import static java.lang.System.*;

public class Printable {
    public String attacktype;
    public int healthpoints;
    public int manapoints;
    public int attackAmount;
    public String PrintableClass;

    public Printable(String attacktype, int healthpoints, int manapoints, int attackAmount) {
        this.attacktype = attacktype;
        this.healthpoints = healthpoints;
        this.manapoints = manapoints;
        this.attackAmount = attackAmount;
    }
    public void restoreHealth(int amount) {
        this.healthpoints += amount;
    }
    public void reduceHealth(int amount) {
        this.healthpoints -= amount;
    }
    public void restoreMana(int amount) {
        this.manapoints += amount;
    }
    public void reduseMana(int amount) {
        this.manapoints -= amount;
    }
    public void attack(Printable p) {
        p.reduceHealth(this.attackAmount);
        System.out.println(this.PrintableClass + " attacked " + p.PrintableClass + " for " + this.attackAmount);
    }

    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        if(healthpoints < 0) this.healthpoints = 0;
        this.healthpoints = healthpoints;
    }

    public int getManapoints() {
        return manapoints;
    }

    public void setManapoints(int manapoints) {
        if(manapoints < 0) this.manapoints = 0;
        this.manapoints = manapoints;
    }

    public void info() {
        System.out.println(this.healthpoints + " " + this.manapoints);


    }
}

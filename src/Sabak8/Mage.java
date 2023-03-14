package Sabak8;

public class Mage extends Printable{
    public Mage(String attacktype, int healthpoints, int manapoints, int attackAmount) {
        super(attacktype, healthpoints, manapoints, attackAmount);
        this.PrintableClass = "Mage";
    }
}

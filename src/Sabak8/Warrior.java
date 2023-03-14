package Sabak8;

public class Warrior extends Printable {
    public Warrior(String attacktype, int healthpoints, int manapoints, int attackAmount) {
        super(attacktype, healthpoints, manapoints, attackAmount);
        this.PrintableClass = "Warrior";
        System.out.println("Warrior const: ");
    }

    @Override
    public void info() {
        System.out.println("Warrior info: ");
        super.info();
    }
}


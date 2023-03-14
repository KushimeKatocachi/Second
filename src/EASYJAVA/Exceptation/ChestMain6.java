package EASYJAVA.Exceptation;

import java.util.concurrent.atomic.AtomicInteger;

public class ChestMain6 {
    private AtomicInteger money = new AtomicInteger();

    public ChestMain6(int money) {
        this.money.set(money);
    }

    public synchronized void withdraw(int amount, PlayerMain6 player) {
        if (this.money.get() >= amount) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money.set(-amount);
            System.out.println("Withdrawn: " + amount + " by player " + player.getName());
        } else {
            System.out.println("Player " + player.getName() + " can't withdraw! Not enough gold! ");
        }
    }

    public void info() {
        System.out.println("Chest gold: " + this.money);
    }
}

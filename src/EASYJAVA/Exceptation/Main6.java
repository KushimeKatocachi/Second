package EASYJAVA.Exceptation;

public class Main6 {
    public static void main(String[] args) {
        ChestMain6 chest = new ChestMain6(100);
        PlayerMain6 player1 = new PlayerMain6("Vasya");
        PlayerMain6 player2 = new PlayerMain6("Rozo4ka");
        PlayerMain6 player3 = new PlayerMain6("Nagibator");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                chest.withdraw(50, player1);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                chest.withdraw(50, player2);
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                chest.withdraw(50, player3);
            }
        });
        try {
        t1.join();
        t2.join();
        t3.join();
        t1.start();
        t2.start();
        t3.start();
    } catch(
    InterruptedException e)

    {
        e.printStackTrace();
    }
        chest.info();
}
}

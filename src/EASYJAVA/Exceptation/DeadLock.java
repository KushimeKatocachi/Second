package EASYJAVA.Exceptation;

public class DeadLock {
    public static final Object anvil = new Object();
    public static final Object bugle = new Object();

    public static void main(String[] args) {
        new Player1().start();
        new Player2().start();
    }



    public static class Player1 extends Thread {
        @Override
        public void run() {
            synchronized (anvil) {
                System.out.println("Player1 is using anvil!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Player1 is waitting for bugle");
            }
            synchronized (bugle) {
                System.out.println("Player1 is using anvil ");
            }
        }
    }
    public static class Player2 extends Thread {
        @Override
        public void run() {
            synchronized (bugle) {
                System.out.println("Player2 is using bugle! ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Player2 is waiting for anvil");
            }
            synchronized (anvil) {
                System.out.println("Player2 is using bugle ");
            }
        }
    }
}

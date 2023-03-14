package EASYJAVA.Exceptation;

public class Main2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    counter.inc();
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    counter.dec();
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter X " + counter.getX());
    }
}

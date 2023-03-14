package EASYJAVA.Exceptation;

public class Main3 {
    public static void main(String[] args) {
        Object object = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("T1 start");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("T1 end");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("T2 start");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("T2 end");
                }
            }
        });
        t1.start();
        t2.start();
    }
}

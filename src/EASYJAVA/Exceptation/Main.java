package EASYJAVA.Exceptation;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run(); //methodty shaqyru

        myThread.setDaemon(true);
        myThread.start();

        Thread myRunable = new Thread(new MyRunable());
        myRunable.start();
        try {
//            myThread.join();
            myRunable.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main End");


    }
}

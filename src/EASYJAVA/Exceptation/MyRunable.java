package EASYJAVA.Exceptation;

public class MyRunable  implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            System.out.println("x: " + x);
        }
    }
}

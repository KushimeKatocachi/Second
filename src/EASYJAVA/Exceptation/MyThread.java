package EASYJAVA.Exceptation;

public class MyThread extends Thread {
    @Override
    public void run() {  //negizgi tizbek maselesi
        for (int x = 0; x < 5; x++) {
            System.out.println("x: " + x);
        }
    }
}

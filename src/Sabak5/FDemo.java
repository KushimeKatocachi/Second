package Sabak5;


public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }
    protected void finalize() {
        System.out.println("Finalization " + x);
    }
    void generator (int i ) {
        FDemo o = new FDemo(i);
    }
}

class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo ob = new FDemo(1000);
        for (count = 1; count < 1000000; count++)
            ob.generator(count);
    }
}


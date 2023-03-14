package EASYJAVA.Exceptation;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger x = new AtomicInteger();

    public Counter() {
        this.x.set(0);
    }

    public AtomicInteger getX(){
        return x;
    }

    public void inc() {
        this.x.incrementAndGet();
    }
    public void dec() {
        this.x.decrementAndGet();
    }
}

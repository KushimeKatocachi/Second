package EASYJAVA.Exceptation;

public class JavaNew extends RuntimeException {
    public JavaNew(String message) {
        super("Super Expatation" + message);
    }

    @Override
    public String toString() {
        return "JavaNew{}";
    }
}

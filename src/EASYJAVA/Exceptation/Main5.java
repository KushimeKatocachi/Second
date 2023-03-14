package EASYJAVA.Exceptation;

public class Main5 {
    public static void main(String[] args) {
        Message message = new Message("Hey" , false);
        new Echo(message);
        new Player(message);
    }
}

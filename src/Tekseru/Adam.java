package Tekseru;

public class Adam {
    public int height = 190;
    public String name = "Default";
    public void say (   String name) {
        System.out.println("Hello" + name);
    }

    public Adam() {}
    public Adam (int h, String n) {
        height = h;
        name = n;
    }
    public Adam (String n) {
        name = n;
    }
}

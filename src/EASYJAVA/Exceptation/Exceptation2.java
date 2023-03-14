package EASYJAVA.Exceptation;

public class Exceptation2 {
    public static void main(String[] args) {
        int a = 0;
        try {
            a += 5;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            a = 1;
        }
        System.out.println(a);
        System.out.println(testFinally());
    }

    public static int testFinally() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
